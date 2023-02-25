package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.repository.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao sDao;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return sDao.save(student);
	}

	@Override
	public Student getByIdStudent(Integer id) throws StudentException {
		// TODO Auto-generated method stub
		Optional<Student> opt = sDao.findById(id);

		if (opt.isEmpty()) {
			throw new StudentException("student not found with " + id);
		}

		return opt.get();
	}

	@Override
	public Student deleteStudent(Integer id) throws StudentException {

		Optional<Student> opt = sDao.findById(id);

		if (opt.isPresent()) {
			Student std = opt.get();
			sDao.delete(std);
			;
			return std;
		}

		throw new StudentException("student not found with " + id);
	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
		// TODO Auto-generated method stub
		List<Student> list = sDao.findAll();

		if (list.size() == 0) {
			throw new StudentException("student not found");
		}
		return list;

	}

	@Override
	public Student updataStudent(Student student) throws StudentException {
		// TODO Auto-generated method stub

		Optional<Student> opt = sDao.findById(student.getId());

		if (opt.isPresent()) {
			Student std = sDao.save(student);
			return std;
		}

		throw new StudentException("student not found");

	}

}
