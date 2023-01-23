package com.masai.service;

import java.util.List;

import com.masai.exception.ProductException;
import com.masai.model.Product;

public interface ProductService {

	public Product addProduct(Product product);
	
	public List<Product> getAllProd()throws ProductException;
	
	public Product deleteProduct(Integer productId)throws ProductException;
	
	public Product getProductById(Integer productId)throws ProductException;
	
	public Product updateProduct(Product product)throws ProductException;
}
