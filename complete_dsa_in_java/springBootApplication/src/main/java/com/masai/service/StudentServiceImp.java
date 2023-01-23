package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.repository.StudentDao;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public Student insertStudentdb(Student student) {

		Student std = studentDao.save(student);
		return std;
	}

	@Override
	public Student deleteStudentdb(Integer id) throws StudentException {

		Optional<Student> opt = studentDao.findById(id);
		if (opt.isPresent()) {
			Student std = opt.get();
			studentDao.delete(std);
			return std;
		} else {
			throw new StudentException("no student find with this id : " + id);
		}
	}

	@Override
	public List<Student> getAllStudentDetailsdb() throws StudentException {
		List<Student> std = studentDao.findAll();
		if (std.size() == 0) {
			throw new StudentException("Student not found");
		}
		return std;
	}

	@Override
	public Student getStudentById(Integer id) throws StudentException {

		Optional<Student> opt = studentDao.findById(id);

//		if(opt.isPresent()) {
//			Student std = opt.get();
//			return std;
//		}else {
//			throw new StudentException("not found student with this id :"+ id);
//		}
		return opt.orElseThrow(() -> new StudentException("not found student with this id :" + id));
	}

	@Override
	public Student updateStudent(Student student) throws StudentException {

		Optional<Student> opt = studentDao.findById(student.getId());
		if (opt.isPresent()) {
			Student uStudent = studentDao.save(student);
			return uStudent;
		}
		throw new StudentException("Invaild Id");
	}

	@Override
	public Student getfindByName(String name) {

		Student student = studentDao.findByName(name);
		if(student == null) {
			throw new StudentException("not found name");
		}else {
			return student;
		}
	}

}
