package com.example.query_farbric.dto;

import com.example.query_farbric.entities.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateProductDTO extends Entities {
	private String name;
	private Long count;
	private String note;
	private Integer category;
}
