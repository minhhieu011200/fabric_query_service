package com.example.query_farbric.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.example.query_farbric.entities.Category;


@Repository
public interface CategoryRepository extends ElasticsearchRepository<Category, Integer> {
	

}
