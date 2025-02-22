package com.cognizant.rfq.supplierModule.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="partid")
	private Integer partId;
	
	private String name;
	private String email;
	
	private String phone;
	private String location;
	private Integer feedback;
	private Integer quantity;
	
	@Column(name="timetosupply")
	private Integer timeToSupply;
	
	public Supplier() {
		super();
	}

	public Supplier(Integer partId, String name, String email, String phone, String location, Integer feedback,
			Integer quantity, Integer timeToSupply) {
		super();
		this.partId = partId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.location = location;
		this.feedback = feedback;
		this.quantity = quantity;
		this.timeToSupply = timeToSupply;
	}

	public Supplier(Integer id, Integer partId, String name, String email, String phone, String location,
			Integer feedback, Integer quantity, Integer timeToSupply) {
		super();
		this.id = id;
		this.partId = partId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.location = location;
		this.feedback = feedback;
		this.quantity = quantity;
		this.timeToSupply = timeToSupply;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPartId() {
		return partId;
	}

	public void setPartId(Integer partId) {
		this.partId = partId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getFeedback() {
		return feedback;
	}

	public void setFeedback(Integer feedback) {
		this.feedback = feedback;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getTimeToSupply() {
		return timeToSupply;
	}

	public void setTimeToSupply(Integer timeToSupply) {
		this.timeToSupply = timeToSupply;
	}
	
	
	
	
}
