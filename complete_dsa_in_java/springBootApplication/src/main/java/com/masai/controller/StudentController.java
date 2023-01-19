package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

import lombok.Delegate;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/student")
	public ResponseEntity<Student> insertStudentdb(@RequestBody Student student) {
		Student std = studentService.insertStudentdb(student);
		return new ResponseEntity<>(std, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<Student> deleteStudentdb(@PathVariable("id") Integer id) {
		Student std = studentService.deleteStudentdb(id);
		return new ResponseEntity<Student>(std, HttpStatus.OK);
	}

	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAllStudentDetailsdb(){
		List<Student> std = studentService.getAllStudentDetailsdb();
		return new ResponseEntity<List<Student>>(std, HttpStatus.OK);
		
	}
}
