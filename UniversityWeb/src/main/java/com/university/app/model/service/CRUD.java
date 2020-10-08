package com.university.app.model.service;

import java.util.List;

public interface CRUD<T> {
	
	public List<T> findAll();

    public T findById(Long id);

    public T save(T t);

    public void delete(Long id);
}
