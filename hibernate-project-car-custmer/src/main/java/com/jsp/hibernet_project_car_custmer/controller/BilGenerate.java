package com.jsp.hibernet_project_car_custmer.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.jsp.hibernet_project_car_custmer.dto.CarBooked;
import com.jsp.hibernet_project_car_custmer.service.CarBookedService;

public class BilGenerate {

	public static void main(String[] args) {
		CarBookedService service=new CarBookedService();
		
		List<CarBooked> carDetails=service.getAllDetails();
		
		
			
		
		for (CarBooked carBooked : carDetails) {
			
			System.out.println(carBooked.getCar().getId());
			System.out.println(carBooked.getCar().getName());
			System.out.println(carBooked.getCar().getPrice());
			
			System.out.println("======================");
			
			System.out.println(carBooked.getPersion().getId());
			System.out.println(carBooked.getPersion().getName());
			
			System.out.println("====================================");
			System.out.println(carBooked.getPersion().getAddress().getCityName());
			System.out.println(carBooked.getPersion().getAddress().getFlatNo());
			
			
			try {
				FileWriter f1=new FileWriter("C:\\Users\\IMTEYAZ\\Desktop\\demo.txt");
				try {
					
					f1.write("CarId  "+"CarName  "+"CarPrice  "+"perdion_name  " +"personEmail  "+"persion_address  " +"\n");
					f1.write(carBooked.getCar().getName()+"    "+carBooked.getCar().getName()+"   "+ " "+carBooked.getCar().getPrice()+" "
							+ "  "+carBooked.getPersion().getName()+"       "+carBooked.getPersion().getEmail()+"  "
							+"  "+carBooked.getPersion().getAddress().getCityName());
					
				} 
				finally {
					f1.close();
				}
				
			} catch (IOException e) {
				
				System.out.println(e);
			}
			
			System.out.println("Successfully Inserted ...");
			
		}

		
		
	}

}
