package com.masai.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Category;
import com.masai.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
