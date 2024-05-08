package com.jsp.hibernet_project_car_custmer.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Address {
   @Id
	private int id;
	private String cityName;
	private String streetName;
	private String flatNo;
	private String townname;
	
//	@OneToOne                   // uni direction
//	private Persion persion;
	
	@OneToOne                  // bi direction
	private Pan pan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getTownname() {
		return townname;
	}

	public void setTownname(String townname) {
		this.townname = townname;
	}


//	public Persion getPersion() {
//		return persion;
//	}
//
//	public void setPersion(Persion persion) {
//		this.persion = persion;
//	}

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}
	
	
}
