package com.university.app.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.app.model.dao.ITeacherDAO;
import com.university.app.model.entities.Teacher;

@Service
public class TeacherServiceImpl implements ITeacherService{

	@Autowired
	private ITeacherDAO teacherDAO;
	
	@Override
	public List<Teacher> findAll() {
		return teacherDAO.findAll();
	}

	@Override
	public Teacher findById(Long id) {
		return teacherDAO.findById(id).orElse(null);
	}

	@Override
	public Teacher save(Teacher teacher) {
		return teacherDAO.save(teacher);
	}

	@Override
	public void delete(Long id) {
		teacherDAO.deleteById(id);;
	}

}
