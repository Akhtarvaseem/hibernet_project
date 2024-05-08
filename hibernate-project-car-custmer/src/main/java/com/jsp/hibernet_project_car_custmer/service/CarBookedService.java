package com.jsp.hibernet_project_car_custmer.service;

import java.util.List;

import com.jsp.hibernet_project_car_custmer.dao.CarBookedDao;
import com.jsp.hibernet_project_car_custmer.dto.CarBooked;

public class CarBookedService {

	CarBookedDao dao=new CarBookedDao();
	public void insertBooked(CarBooked carBook) {
		
		dao.insertBooked(carBook);
	}
	
	// Bil genrate 
	public List<CarBooked> getAllDetails(){
		return dao.getAllDetails();
	}
}
