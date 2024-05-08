package com.jsp.spring_core_with_anotation.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private int id;
	private String name;
	private Double price;
	
	public Laptop(@Value(value="123") int id, @Value(value="HP") String name, @Value(value="120")Double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}

	@Override
	public String toString() 
	{
		return "Laptop [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
