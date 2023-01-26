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

import com.masai.model.StudentDTO;
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
	public ResponseEntity<List<Student>> getAllStudentDetailsdb() {
		List<Student> std = studentService.getAllStudentDetailsdb();
		return new ResponseEntity<List<Student>>(std, HttpStatus.OK);

	}

	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getByIdStudentdb(@PathVariable("id") Integer id) {
		Student std = studentService.getStudentById(id);
		return new ResponseEntity<Student>(std, HttpStatus.OK);
	}

	@PutMapping("/students")
	public ResponseEntity<Student> updateStudentH(@RequestBody Student student) {
		Student std = studentService.updateStudent(student);
		return new ResponseEntity<Student>(std, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/student/get/{name}")
	public ResponseEntity<Student> findByNameH(@PathVariable("name") String name) {
		Student std = studentService.getfindByName(name);
		return new ResponseEntity<Student>(std, HttpStatus.OK);
	}
	
	
	@GetMapping("/student/getmarks/{marks}")
	public ResponseEntity<List<Student>> findByMarksH(@PathVariable("marks") Integer marks) {
		List<Student> std = studentService.getStudentNameByMarks(marks);
		return new ResponseEntity<List<Student>>(std, HttpStatus.OK);
	}
	
	@GetMapping("/student/getId/{id}")
	public ResponseEntity<String> getStudentNameByIdH(@PathVariable("id") Integer id) {
		String std = studentService.getStudentNameById(id);
		return new ResponseEntity<String>(std, HttpStatus.OK);
	}
	
	@GetMapping("/student/getDtoId/{id}")
	public ResponseEntity<StudentDTO> getStudentNameById2H(@PathVariable("id") Integer id) {
		StudentDTO std = studentService.getStudentNameById2(id);
		return new ResponseEntity<StudentDTO>(std, HttpStatus.OK);
	}
	

}
