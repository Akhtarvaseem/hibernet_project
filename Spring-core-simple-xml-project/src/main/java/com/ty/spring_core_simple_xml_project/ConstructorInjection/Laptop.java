package com.ty.spring_core_simple_xml_project.ConstructorInjection;

public class Laptop {
	
	private int id;
	private String name;
	private double price;
	
	// alt+s+a shortcut constructor
	public Laptop(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	}
	
	public String toString() {
		return  "id=> "+id+" \n name=> "+name+"\n email=> "+price;
		
	}

	
}
