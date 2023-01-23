package com.masai.service;

import java.util.List;

import com.masai.exception.StudentException;
import com.masai.model.Student;

public interface StudentService {
   
	public Student insertStudentdb(Student student);
	
	public Student deleteStudentdb(Integer id)throws StudentException;
	
	public List<Student> getAllStudentDetailsdb()throws StudentException;
	
	public Student getStudentById(Integer id)throws StudentException;
	
	public Student updateStudent(Student student)throws StudentException;
	
	public Student getfindByName(String name);
   
}
