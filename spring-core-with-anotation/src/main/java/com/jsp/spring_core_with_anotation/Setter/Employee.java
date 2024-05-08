package com.jsp.spring_core_with_anotation.Setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	private String name;
	private String email;
	
	
	public int getId() {
		return id;
	}
	
	@Value(value="123")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@Value(value="Raj")
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	
	@Value(value="raj@gamil.com")
	public void setEmail(String email) {
		this.email = email;
	}

}
