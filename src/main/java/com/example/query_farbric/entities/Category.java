package com.example.query_farbric.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Document(indexName = "category")
@AllArgsConstructor
@NoArgsConstructor

public class Category extends EntitiesELK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6784724632683491049L;

	/**
	 * 
	 */

	@NotNull
	String name;

//	@JsonBackReference
//	List<Product> products = new ArrayList<Product>();

	public String getName() {
		return name;
	}

//	public List<Product> getProducts() {
//		return products;
//	}

	public void setName(String name) {
		this.name = name;
	}

//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}
}
