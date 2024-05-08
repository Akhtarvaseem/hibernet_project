
package com.jsp.hibernet_project_car_custmer.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.hibernet_project_car_custmer.dao.CarDao;
import com.jsp.hibernet_project_car_custmer.dao.PersionDao;
import com.jsp.hibernet_project_car_custmer.dto.Car;
import com.jsp.hibernet_project_car_custmer.dto.CarBooked;
import com.jsp.hibernet_project_car_custmer.dto.Persion;
import com.jsp.hibernet_project_car_custmer.service.CarBookedService;

public class CarBookedController {

	public static void main(String[] args) {

		CarBookedService service=new CarBookedService();
		CarBooked booked=new CarBooked();
		
		 PersionDao dao=new PersionDao();
		 CarDao dao1=new CarDao();
		 Scanner sc=new Scanner(System.in);
		 
		 List<Car> list2=dao1.getAllCar();
		 List<Persion> list=dao.getAllPersion();
		 
		 System.out.println("Enter your carBooked ID");
		 booked.setCarBookingId(sc.nextInt());
		 
		 for (Persion persion2 : list) {
			 booked.setPersion(persion2);
			 			
		}
		 for (Car car1 : list2) {
			booked.setCar(car1);
		}
		 
		 service.insertBooked(booked);

	}

}
