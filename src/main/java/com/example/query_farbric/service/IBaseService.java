package com.example.query_farbric.service;

import com.example.query_farbric.entities.Entities;

public interface IBaseService<T,I> {
	public T save(T t);
	
	public T updateById(I id,T t);
	
	public void deleteById(I id);
	
	public T saveOrUpdate(T t);
}
