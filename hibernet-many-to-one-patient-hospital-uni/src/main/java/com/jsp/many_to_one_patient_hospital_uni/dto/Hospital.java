package com.jsp.many_to_one_patient_hospital_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
  @Id
	private int hId;
	public int gethId() {
	return hId;
}
public void sethId(int hId) {
	this.hId = hId;
}
public String gethName() {
	return hName;
}
public void sethName(String hName) {
	this.hName = hName;
}
public String gethAddress() {
	return hAddress;
}
public void sethAddress(String hAddress) {
	this.hAddress = hAddress;
}
	private String hName;
	private String hAddress;
	
	
}
