package com.university.app.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.app.model.entities.Teacher;

public interface ITeacherDAO extends JpaRepository<Teacher, Long>{

}
