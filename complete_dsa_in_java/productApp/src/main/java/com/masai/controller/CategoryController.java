package com.masai.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Category;
import com.masai.model.Product;
import com.masai.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService cService;
	
	@PostMapping("/category/add")
	public ResponseEntity<Category> addCategory(@RequestBody Category category) {
		
		Category addCat = cService.addCategory(category);
		return new ResponseEntity<Category>(addCat, HttpStatus.CREATED);
	}
	
	@GetMapping("/category/view/{categoryId}")
	public ResponseEntity<Category> viewCategory(@PathVariable("categoryId") int categoryId){
		Category category = cService.viewCategory(categoryId);
		return new ResponseEntity<Category>(category, HttpStatus.OK);
	}

	@DeleteMapping("/category/delete/{categoryId}")
	public ResponseEntity<Category> deleteCategory(@PathVariable("categoryId") int categoryId) {
		Category category = cService.deleteCategory(categoryId);
		return new ResponseEntity<Category>(category, HttpStatus.OK);
	}
	
	@GetMapping("/category/all")
	public ResponseEntity<List<Category>> allCategory(){
		List<Category> list =  cService.allCategory();
		return new ResponseEntity<List<Category>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/category/viewProductByCategory/{id}")
	public ResponseEntity<List<Product>> productByCategory(@PathVariable("id") int categoryId){
		List<Product> pList = cService.productByCategory(categoryId);
		return new ResponseEntity<List<Product>>(pList, HttpStatus.OK);
	}
}
