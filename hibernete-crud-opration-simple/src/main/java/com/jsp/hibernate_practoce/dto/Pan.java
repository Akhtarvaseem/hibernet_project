package com.jsp.hibernate_practoce.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pan {

	@Id
    int id;
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
	private String name;
	
}
