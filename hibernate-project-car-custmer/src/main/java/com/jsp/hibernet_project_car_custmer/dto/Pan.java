package com.jsp.hibernet_project_car_custmer.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Pan {

	@Id
	private int id;
	private String panNum;
	private String DOB;           //change after sometime
	
	private String gender;
	
	@OneToOne                    //bi direction
	private Address address;
	
//	@OneToOne                   // uni direction 
//	private Persion persion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
//	public Persion getPersion() {
//		return persion;
//	}
//	public void setPersion(Persion persion) {
//		this.persion = persion;
//	}
	
	
}
