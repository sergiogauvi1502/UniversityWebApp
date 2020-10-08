package com.university.app.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.app.model.dao.IStudentDAO;
import com.university.app.model.entities.Student;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDAO studentDAO;
	
	@Override
	public List<Student> findAll() {
		return studentDAO.findAll();
	}

	@Override
	public Student findById(Long id) {
		return studentDAO.findById(id).orElse(null);
	}

	@Override
	public Student save(Student student) {
		return studentDAO.save(student);
	}

	@Override
	public void delete(Long id) {
		studentDAO.deleteById(id);
	}

}
