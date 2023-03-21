package com.masai.service;

import java.lang.StackWalker.Option;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CategoryException;
import com.masai.exception.ProductException;
import com.masai.model.Category;
import com.masai.model.Product;
import com.masai.model.repository.CategoryDao;
import com.masai.model.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao pDao;
	
	@Autowired
	private CategoryDao cDao;

//	@Override
//	public Product addProduct(Product product) {
//
//		Product prd = pDao.save(product);
//		return prd;
//	}
	
	@Override
	public Product addProduct(Product product, Integer categoryId) {

		Optional<Category> opt = cDao.findById(categoryId);
		
		if(opt.isPresent()) {
			
			Category category = opt.get();
			
			category.getProducts().add(product);
			
			product.setCategory(category);
			
			Product savePrd = pDao.save(product);
			return savePrd;
		}else {
			throw new CategoryException("category not found with id "+categoryId);		
			}
	}

	@Override
	public List<Product> getAllProd() throws ProductException {

		List<Product> list = pDao.findAll();
		if (list.size() == 0) {
			throw new ProductException("products not found");
		} else {
			return list;
		}
	}

	@Override
	public Product deleteProduct(Integer productId) throws ProductException {

		Optional<Product> opt = pDao.findById(productId);
		if (opt.isPresent()) {
		    opt.get().setCategory(null);
			pDao.delete(opt.get());
			return opt.get();
		} else {
			throw new ProductException("product not found with this :" + productId);
		}	
	}

	@Override
	public Product getProductById(Integer productId) throws ProductException {

		Optional<Product> opt = pDao.findById(productId);
		if (opt.isPresent()) {
			Product pd = opt.get();
			return pd;
		} else {
			throw new ProductException("product not found with this :" + productId);
		}
	}

	@Override
	public Product updateProduct(Product product) throws ProductException {

		Optional<Product> opt = pDao.findById(product.getProductId());
		if (opt.isPresent()) {
			Product pd = pDao.save(product);
			return pd;
		} else {
			throw new ProductException("product not found");
		}
	}



}
