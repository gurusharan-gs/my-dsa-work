package com.masai.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.model.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao pDao;

	@Override
	public Product addProduct(Product product) {

		Product prd = pDao.save(product);
		return prd;
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
			Product pd = opt.get();
			pDao.delete(pd);
			return pd;
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
