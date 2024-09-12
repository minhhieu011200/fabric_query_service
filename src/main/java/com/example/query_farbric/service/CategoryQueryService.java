package com.example.query_farbric.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.query_farbric.entities.Category;
import com.example.query_farbric.exception.AppException;
import com.example.query_farbric.exception.ErrorCode;
import com.example.query_farbric.repository.CategoryRepository;
import com.example.query_farbric.repository.ProductRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
public class CategoryQueryService implements ICategoryQueryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category save(Category category) {
		try {
			Category newCategory= categoryRepository.save(category);
			log.info("222222222222222222222"+newCategory);
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			log.error("222222222222222222222"+e.getMessage());
			return null;
		}
		 
	}

	@Override
	public Category updateById(Integer id, Category data) {
		Category category = categoryRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.ID_EXIST));
		category.setName(data.getName());
		category = categoryRepository.save(category);
		return category;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Category saveOrUpdate(Category t) {
		// TODO Auto-generated method stub
		return null;
	}

}
