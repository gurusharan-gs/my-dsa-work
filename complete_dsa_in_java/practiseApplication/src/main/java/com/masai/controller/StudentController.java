package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService sService;
	
	@PostMapping("/student/add")
	public ResponseEntity<Student> addStudentH(@RequestBody Student student){
		Student std = sService.addStudent(student);
		return new  ResponseEntity<Student>(std, HttpStatus.CREATED);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getByIdStudentH(@PathVariable("id") Integer id){
		Student std = sService.getByIdStudent(id);
		return new  ResponseEntity<Student>(std, HttpStatus.OK);
	}
	
	@DeleteMapping("/student/delete/{id}")
	public ResponseEntity<Student> deleteByIdStudentH(@PathVariable("id") Integer id){
		Student std = sService.deleteStudent(id);
		return new  ResponseEntity<Student>(std, HttpStatus.OK);
	}
	
	@GetMapping("/student/list")
	public ResponseEntity<List<Student>> getAllStudentH(){
		List<Student> list = sService.getAllStudent();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	
	@PutMapping("/student/update")
	public ResponseEntity<Student> updataStudent(@RequestBody Student student) {
		Student ups = sService.updataStudent(student);
		return new ResponseEntity<Student>(ups, HttpStatus.OK);
	}
	
	
}
