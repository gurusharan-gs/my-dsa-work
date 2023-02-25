package com.masai.service;

import java.util.List;

import com.masai.exception.StudentException;
import com.masai.model.Student;

public interface StudentService {

	public Student addStudent(Student student);
	
	public Student getByIdStudent(Integer id)throws StudentException;
	
	public Student deleteStudent(Integer id)throws StudentException;
	
	public List<Student> getAllStudent()throws StudentException;
	
	public Student updataStudent(Student student)throws StudentException;
	
	
}
