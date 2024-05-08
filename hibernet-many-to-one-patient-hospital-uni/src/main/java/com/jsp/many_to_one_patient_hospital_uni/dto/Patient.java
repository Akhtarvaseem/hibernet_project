package com.jsp.many_to_one_patient_hospital_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Patient {
    
	@Id
	private int Pid;
	private String Pname;
	private int Page;
	private String Pgender;
	private String Pinsurence;
	
	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public int getPage() {
		return Page;
	}

	public void setPage(int page) {
		Page = page;
	}

	public String getPgender() {
		return Pgender;
	}

	public void setPgender(String pgender) {
		Pgender = pgender;
	}

	public String getPinsurence() {
		return Pinsurence;
	}

	public void setPinsurence(String pinsurence) {
		Pinsurence = pinsurence;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	@ManyToOne
	private Hospital hospital;
}
