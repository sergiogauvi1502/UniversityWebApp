package com.university.app.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.app.model.entities.Subject;

public interface ISubjectDAO extends JpaRepository<Subject, Long>{

}
