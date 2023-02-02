package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Entire;

@Repository
public interface EntireDao extends JpaRepository<Entire, Integer>{

}
