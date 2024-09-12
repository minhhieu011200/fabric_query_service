package com.example.query_farbric.entities;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Version;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Document(indexName = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends EntitiesELK implements  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 397627746711972977L;

	private String name;

	private Long count;

	private Boolean isDelete;

	@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private String dateDelete;

	private String note;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@PrimaryKeyJoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "fk_product_category"))
//	@JsonManagedReference
//    @Field(type = FieldType.Nested)
	private Category category;

	public String getName() {
		return name;
	}

	public Long getCount() {
		return count;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public String getNote() {
		return note;
	}

	public Category getCategory() {
		return category;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDateDelete() {
		return dateDelete;
	}

	public void setDateDelete(String dateDelete) {
		this.dateDelete = dateDelete;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", count=" + count + ", isDelete=" + isDelete + ", dateDelete=" + dateDelete
				+ ", note=" + note + ", category=" + category + "]";
	}


}
