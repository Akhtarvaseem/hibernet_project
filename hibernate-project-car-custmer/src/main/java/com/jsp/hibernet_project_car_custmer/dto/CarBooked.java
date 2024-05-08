package com.jsp.hibernet_project_car_custmer.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CarBooked {
	
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int carBookingId;
	
	@OneToOne
	private Car car;
	
	@OneToOne
	private Persion persion;

	public int getCarBookingId() {
		return carBookingId;
	}

	public void setCarBookingId(int carBookingId) {
		this.carBookingId = carBookingId;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Persion getPersion() {
		return persion;
	}

	public void setPersion(Persion persion) {
		this.persion = persion;
	}
	
	
}

