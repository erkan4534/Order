package com.order.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Porducts")
public class Product {

	public Product(Long id, Category category, String productName,Double unitPrice,Long unitsInStock) {
		this.id = id;
		this.category = category;
		this.productName = productName;
		this.unitsInStock = unitsInStock;
		this.unitPrice = unitPrice;
	}
	
	public Product() {}
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(columnDefinition = "CategoryId")
	private Category category;
	
	@Column(name = "ProductName")
	private String productName;
	
	@Column(name = "UnitsInStock")
	private Long unitsInStock;

	@Column(name = "UnitPrice")
	private Double unitPrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(Long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}


	
}
