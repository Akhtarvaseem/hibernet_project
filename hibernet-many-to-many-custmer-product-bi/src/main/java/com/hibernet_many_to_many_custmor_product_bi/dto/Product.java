package com.hibernet_many_to_many_custmor_product_bi.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {

	@Id
	private int id;
	private String name;
	private double price;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Custmor> custmer;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Custmor> getCustmer() {
		return custmer;
	}

	public void setCustmer(List<Custmor> custmer) {
		this.custmer = custmer;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
