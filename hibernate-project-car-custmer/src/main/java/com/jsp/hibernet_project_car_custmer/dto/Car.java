package com.jsp.hibernet_project_car_custmer.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
@Entity
public class Car {
    @Id
	private int id;
	private String name;
	private String color;
	private double price;
	private int modelNo;
	
	@OneToMany
	private List<Persion> persion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public List<Persion> getPersion() {
		return persion;
	}

	public void setPersion(List<Persion> persion) {
		this.persion = persion;
	}
	
	
}
