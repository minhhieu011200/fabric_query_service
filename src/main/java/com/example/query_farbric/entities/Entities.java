package com.example.query_farbric.entities;

import java.util.Date;

//import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entities {
	@Id
	private Integer id;

//	@CreationTimestamp
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date createDate;

//	@UpdateTimestamp
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date updateDate;
	
	private Integer version;
}
