package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService sService;
	
	@PostMapping("/studentAdd")
	public ResponseEntity<Student> addStudentHandel(@RequestBody Student student){
		Student saveStudent =  sService.addStudent(student);
		
		return new ResponseEntity<Student>(saveStudent, HttpStatus.CREATED);
	}

}
