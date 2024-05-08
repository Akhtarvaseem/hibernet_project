package com.ty.one_to_one_uni.controller;

import java.util.List;
import java.util.Scanner;

import com.ty.one_to_one_uni.dto.Employee;
import com.ty.one_to_one_uni.dto.Laptop;
import com.ty.one_to_one_uni.service.EmployeeService;

public class Controller {

	public static void main(String[] args) {
	   
        Employee employee=null;
        Laptop laptop =null;
        EmployeeService service=new EmployeeService();
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("1. insert \n2. Update \n3. Delete \n4.Dispaly \5.Exit");
			
			System.out.println("Enter your choice...");
			
			int ch=sc.nextInt();
			
			switch(ch) 
			{
			case 1:{
				employee=new Employee();
		         laptop =new Laptop();
				
				System.out.println("Enter Laptop Price ");
				 laptop.setPrice(sc.nextInt());
				 
				System.out.println("Enter Laptop name ");
				laptop.setName(sc.next());
				
				System.out.println(" Eneter laptop color");
				laptop.setColor(sc.next());
				
				System.out.println("Enter laptop proceser");
				laptop.setProceser(sc.next());
				
				
				System.out.println(" Here you are enter the details of Employee...");
				
				System.out.println("Enter Employee name ");
				employee.setName(sc.next());
				 
				System.out.println("Enter Employee Email ");
				employee.setEmail(sc.next());
				
			
				employee.setLaptop(laptop);
				
				service.insertDao(employee, laptop);
			}
			break;
			case 2:{
				
				employee=new Employee();
		        laptop =new Laptop();
				
				
				 System.out.println("Enter your id ");
				int id=sc.nextInt();
				
				System.out.println("Enter laptop proceser");
				String proceser=sc.next();
				
				
				System.out.println(" Here you are enter the details of Employee...");
				
				System.out.println("Enter Employee name ");
				String name=sc.next();
				 
				
				service.updateDao(id, name, proceser);
			
			}
			break;
			case 3:{
				 System.out.println("Enter your id ");
				int id=sc.nextInt();
				
				service.delteDao(id);
			}
			break;
			case 4:{
				  List<Employee> list=service.displayDao();
				  
				  for (Employee employee2 : list) {
					
					  System.out.println(employee2.getId());
					  System.out.println(employee2.getName());
					  System.out.println(employee2.getEmail());
					  
					  System.out.println("............................");
					  System.out.println(employee2.getLaptop().getName());
					  System.out.println(employee2.getLaptop().getPrice());
					  System.out.println(employee2.getLaptop().getProceser());
					  System.out.println(employee2.getLaptop().getColor());
					  
					  System.out.println("===================================");
				}
			}
			break;
			}
			
		}
	}

}
