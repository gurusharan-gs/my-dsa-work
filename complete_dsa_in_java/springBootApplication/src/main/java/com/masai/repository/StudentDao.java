package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Student;
import com.masai.model.StudentDTO;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

	public Student findByName(String name);
	
	public List<Student> findByMarks(Integer marks);
	
//	@Query("select s.name from Student s where s.id=?1")
	@Query("select s.name,s.marks from Student s where s.id=?1")
	public String getStudentNameById(Integer id);
	
	
	@Query("select new com.masai.model.StudentDTO(s.name, s.marks) from Student s where s.id=?1")
	public StudentDTO getStudentNameById2(Integer id);


	
}
