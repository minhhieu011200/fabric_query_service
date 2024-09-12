package com.example.query_farbric.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

//import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EntitiesELK extends Entities {

	@CreatedDate
	@Field(type = FieldType.Date,format = {}, pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime createDateELK;

	@LastModifiedDate
	@Field(type = FieldType.Date,format = {}, pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime  updateDateELK;

	@Version
    @Field(type = FieldType.Long)
	private Long versionELK;
}
