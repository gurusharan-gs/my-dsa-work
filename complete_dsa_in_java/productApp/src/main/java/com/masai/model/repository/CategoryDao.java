package com.masai.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

	public List<Category> findByName(String name);
}
