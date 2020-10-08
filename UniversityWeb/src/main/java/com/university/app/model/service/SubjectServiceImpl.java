package com.university.app.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.app.model.dao.ISubjectDAO;
import com.university.app.model.entities.Subject;

@Service
public class SubjectServiceImpl implements ISubjectService{
	
	@Autowired
	private ISubjectDAO subjectDAO;
	
	@Override
	public List<Subject> findAll() {
		return subjectDAO.findAll();
	}

	@Override
	public Subject findById(Long id) {
		return subjectDAO.findById(id).orElse(null);
	}

	@Override
	public Subject save(Subject subject) {
		return subjectDAO.save(subject);
	}

	@Override
	public void delete(Long id) {
		
	}
	
	
}
