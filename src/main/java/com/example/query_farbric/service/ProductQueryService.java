package com.example.query_farbric.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.query_farbric.dto.CreateProductDTO;
import com.example.query_farbric.entities.Category;
import com.example.query_farbric.entities.Product;
import com.example.query_farbric.repository.ProductRepository;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class ProductQueryService implements IProductQueryService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product save(Product product) {
		try {
			Product newProduct= productRepository.save(product);
			return newProduct;
		} catch (Exception e) {
			log.info("2222222222222222222222222"+e.getMessage());
			return null;
		}
	}

	@Override
	public Product updateById(Integer id, Product t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product saveOrUpdate(Product t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
