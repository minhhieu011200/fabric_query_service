package com.example.query_farbric.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.example.query_farbric.entities.Product;


@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, Integer>{

}
