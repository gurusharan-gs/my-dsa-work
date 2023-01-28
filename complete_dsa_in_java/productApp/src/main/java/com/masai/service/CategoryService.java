package com.masai.service;

import java.util.List;

import com.masai.exception.CategoryException;
import com.masai.model.Category;
import com.masai.model.Product;

public interface CategoryService {
	
	public Category addCategory(Category category)throws CategoryException;
	
	public Category viewCategory(int categoryId)throws CategoryException;
	
	public Category deleteCategory(int categoryId)throws CategoryException;
	
	public List<Category> allCategory()throws CategoryException;
	
	public List<Product> productByCategory(int categoryId)throws CategoryException;

}
