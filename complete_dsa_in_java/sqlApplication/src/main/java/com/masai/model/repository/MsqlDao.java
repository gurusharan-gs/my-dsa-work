package com.masai.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.model.Msql;

@Repository
public interface MsqlDao extends JpaRepository<Msql, Integer>{

//	"select s.name from Student s where s.roll=?1"
//	@Query("s.query from Msql s where s.name=?1")
//	public Msql getQueryByName(String name);
	@Query("SELECT m.query FROM Msql m WHERE m.name LIKE %:title%")
	public List<String> findByNameLike(@Param("title") String name);
}
