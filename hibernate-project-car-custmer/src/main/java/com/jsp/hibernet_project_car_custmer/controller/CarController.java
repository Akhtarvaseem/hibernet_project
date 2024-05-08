package com.jsp.hibernet_project_car_custmer.controller;


import java.util.List;
import java.util.Scanner;

import com.jsp.hibernet_project_car_custmer.dao.PersionDao;

import com.jsp.hibernet_project_car_custmer.dto.Car;
import com.jsp.hibernet_project_car_custmer.dto.Persion;
import com.jsp.hibernet_project_car_custmer.service.CarService;

public class CarController {

	public static void main(String[] args) {
		

		CarService service=new CarService();
		Car car=new Car();
		
		Scanner sc=new Scanner(System.in);
		
		
		PersionDao dao=new PersionDao();
		List<Persion> list=dao.getAllPersion();
		
		Persion newPerson=new Persion();
		
//		for (Persion persion : list) {
//			
//			newPerson.setId(persion.getId());	
//		}
		
		System.out.println("Enter car id");
		car.setId(sc.nextInt());

		System.out.println("Enter car Name");
		car.setName(sc.next());
		
		System.out.println("Enter car Color");
		car.setColor(sc.next());
		
		System.out.println("Enter car Price in double");
		car.setPrice(sc.nextDouble());
		
		System.out.println("Enter car Model Number Int");
		car.setModelNo(sc.nextInt());
		
        car.setPersion(list);
        
        for(int i=0;i<list.size();i++) {
        	
        		car.setPersion(list);
        	
        }
       
		
		
		service.insertCar(car);
		
	}

}
