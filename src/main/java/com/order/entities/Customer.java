package com.order.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Long id;

	@Column(name = "CustomerNo")
	private String customerNo;
	
	@Column(name = "ContactName")
	private String contactName;
	
	@Column(name = "CompanyName")
	private String CompanyName;
	
	@Column(name = "City")
	public String city;
   
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	
}
