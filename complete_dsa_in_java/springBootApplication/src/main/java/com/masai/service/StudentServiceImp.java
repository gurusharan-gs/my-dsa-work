package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.repository.StudentDao;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Student insertStudentdb(Student student) {
		
		Student std = studentDao.save(student);
		
		return std;	
	}

	@Override
	public Student deleteStudentdb(Integer id)throws StudentException {
		Optional<Student> opt = studentDao.findById(id);
		if(opt.isPresent()) {
			Student std = opt.get();
			studentDao.delete(std);
			return std;
		}else {
			throw new StudentException("no student find with this id : "+id);
		}
	}

	@Override
	public List<Student> getAllStudentDetailsdb() throws StudentException {
             List<Student> std =  studentDao.findAll();
             return std;
	}

}
