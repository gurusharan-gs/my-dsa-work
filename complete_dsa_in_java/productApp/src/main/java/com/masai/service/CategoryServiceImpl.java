package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CategoryException;
import com.masai.model.Category;
import com.masai.model.Product;
import com.masai.model.repository.CategoryDao;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao cDao;
	
	@Override
	public Category addCategory(Category category) throws CategoryException {

		List<Category> catList = cDao.findByName(category.getName());
		if(catList.size() != 0) {
			throw new CategoryException("category already registered with this name id is :"+ catList.get(0).getCategoryId());
		}
		return cDao.save(category);

	}

	@Override
	public Category viewCategory(int categoryId) throws CategoryException {

		Optional<Category> opt =  cDao.findById(categoryId);
		if(opt.isPresent()) {
			Category category = opt.get();
			return category;
		}else {
			throw new CategoryException("category not found with id "+categoryId);
		}
	}

	@Override
	public Category deleteCategory(int categoryId) throws CategoryException {

		Optional<Category> opt = cDao.findById(categoryId);
		if(opt.isPresent()) {
			Category category = opt.get();
			cDao.delete(category);
			return category;
		}else {
			throw new CategoryException("category not found with id "+categoryId);
		}
	}

	@Override
	public List<Category> allCategory() throws CategoryException {

		List<Category> list = cDao.findAll();
		if(list.size() == 0) {
			throw new CategoryException("list empty");
		}else {
			return list;
		}
	}

	@Override
	public List<Product> productByCategory(int categoryId) throws CategoryException {
	
		Optional<Category> opt = cDao.findById(categoryId);
		if(opt.isPresent()) {
			List<Product> product = opt.get().getProducts();
			return product;
		}else {
			throw new CategoryException("category not found with id "+categoryId);
		}
	}

}
