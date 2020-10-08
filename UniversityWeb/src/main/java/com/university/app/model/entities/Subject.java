package com.university.app.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subject {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subjects")
    private Long idSubject;
    @Column(name = "names")
    private String name;
    private String schedule;
    @Column(name = "space_available")
    private int spaceAvailable;
    /*@Column(name = "id_teachers")
    private Teacher idTeacher;*/
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public int getSpaceAvailable() {
		return spaceAvailable;
	}
	public void setSpaceAvailable(int spaceAvailable) {
		this.spaceAvailable = spaceAvailable;
	}
}
