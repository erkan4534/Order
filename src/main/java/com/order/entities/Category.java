package com.order.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categories")
public class Category {

	public Category(Long id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}

	public Category() {}

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Long id;

    @Column(name = "CategoryName")
	private String categoryName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
