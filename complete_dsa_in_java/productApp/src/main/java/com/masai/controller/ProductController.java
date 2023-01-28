package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Product;
import com.masai.service.ProductService;

import lombok.Delegate;

@RestController
public class ProductController {

	@Autowired
	private ProductService pService;
	
	@PostMapping("/product/{categoryId}")
	public ResponseEntity<Product> addProductHandel(@RequestBody Product product, @PathVariable("categoryId") Integer categoryId) {
		Product addPrd =  pService.addProduct(product, categoryId);
		return new ResponseEntity<Product>(addPrd, HttpStatus.CREATED);
	}
	
	@GetMapping("/product/list")
	public ResponseEntity<List<Product>> allProductHandel() {
		List<Product> allPrd = pService.getAllProd();
		return new ResponseEntity<List<Product>>(allPrd, HttpStatus.OK);
	}
	
	@DeleteMapping("/product/delete/{id}")
	public ResponseEntity<Product> deleteProductHandel(@PathVariable("id") Integer productId) {
		Product deletePrd =  pService.deleteProduct(productId);
		return new ResponseEntity<Product>(deletePrd, HttpStatus.OK);
	}
	
	@GetMapping("/product/get/{id}")
	public ResponseEntity<Product> getByIdProductHandel(@PathVariable("id") Integer productId) {
		Product getPrd =  pService.getProductById(productId);
		return new ResponseEntity<Product>(getPrd, HttpStatus.OK);
	}
	
	@PutMapping("/product/update")
	public ResponseEntity<Product> updateProductHandel(@RequestBody Product product) {
		Product updateprd = pService.updateProduct(product);
		return new ResponseEntity<Product>(updateprd, HttpStatus.ACCEPTED);
	}
}
