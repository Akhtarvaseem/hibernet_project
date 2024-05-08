package com.hibernet_one_to_many_StudentSubject_bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Subject {
    
	@Override
	public String toString() {
		return "Subject [code=" + code + ", name=" + name + "]";
	}

	@Id
	private int code;
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Student student;                /// this data auto set in student table 

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
