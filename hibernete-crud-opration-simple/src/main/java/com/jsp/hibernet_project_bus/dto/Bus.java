package com.jsp.hibernet_project_bus.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bus {
    @Id
	private int busNum;
	private String busType;
	private int passengers;
	
	public int getBusNum() {
		return busNum;
	}
	public void setBusNum(int busNum) {
		this.busNum = busNum;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	
}
