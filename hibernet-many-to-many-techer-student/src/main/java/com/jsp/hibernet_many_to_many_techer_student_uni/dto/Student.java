package com.jsp.hibernet_many_to_many_techer_student_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
	private int sId;
	private String name;
	private String email;
	private String branch;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
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
	public String getBranch() {
		
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
