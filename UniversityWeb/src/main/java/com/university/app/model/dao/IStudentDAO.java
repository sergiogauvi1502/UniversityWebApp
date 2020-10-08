package com.university.app.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.app.model.entities.Student;

public interface IStudentDAO extends JpaRepository<Student, Long>{

}
