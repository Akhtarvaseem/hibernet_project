package com.jsp.hibernet_project_car_custmer.service;

import java.util.List;

import com.jsp.hibernet_project_car_custmer.dao.CarDao;
import com.jsp.hibernet_project_car_custmer.dto.Car;
import com.jsp.hibernet_project_car_custmer.dto.Persion;

public class CarService {
    CarDao dao=new CarDao();
    
	public void insertCar(Car car) {
		dao.insertCar(car);
	}
}
