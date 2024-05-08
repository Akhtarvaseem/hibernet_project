package com.jsp.one_to_one_LaptopProceser_uni.controller;

import java.util.Scanner;

import com.jsp.one_to_one_LaptopProceser_uni.dto.Laptop;
import com.jsp.one_to_one_LaptopProceser_uni.dto.Processor;
import com.jsp.one_to_one_LaptopProceser_uni.service.LapProService;

public class LapProController {

	public static void main(String[] args) {
		
		Laptop laptop =new Laptop();
	    Processor processor= new Processor();
		
	    LapProService service=new LapProService();
		while(true) {
			 
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Insert \n2. Update \n3. UpdateAll \n4.Delete \n4.Dispaly ");
			System.out.println("Enter your choice  ");
			int ch=sc.nextInt();
			switch(ch) {
			 
			case 1:{
				
				
				System.out.println("Enter your processor Id");
				processor.setId(sc.nextInt());
				
				System.out.println("Enter your processor Name");
				processor.setName(sc.next());
				
				System.out.println("Enter your processor Speed");
				processor.setSpeed(sc.nextInt());
				
				System.out.println("Enter your processor core ");
				processor.setCore(sc.next());
				
				System.out.println("................Enter fill your Laptop data............"); 
				
				System.out.println("Enter Your laptop Id ");
				laptop.setId(sc.nextInt());
				
				System.out.println("Enter Your laptop name ");
				laptop.setLname(sc.next());
				
				System.out.println("Enter Your laptop price ");
				laptop.setPrice(sc.nextDouble());
				
				laptop.setProcessor(processor);
				
				
				service.insertDao(laptop, processor);
				
			}
			break;
			
			case 2:{
				
				System.out.println("Enter your processor Old Id");
				int id=sc.nextInt();
				
				System.out.println("Enter your updated price");
				Double price=sc.nextDouble();
				
				System.out.println("Enter your updated core");
				String core=sc.next();
				
				service.updateDao(id, price, core);
			}
			break;
			case 3:{
				
				System.out.println("Enter Your laptop Id");
				int id=sc.nextInt();
				
				System.out.println("Enter Your laptop name ");
				laptop.setLname(sc.next());
				
				System.out.println("Enter Your laptop price ");
				laptop.setPrice(sc.nextDouble());
				
				System.out.println("................Enter fill your Laptop data............"); 
//				
//				System.out.println("Enter your processor Id");
//				processor.setId(sc.nextInt());
				
				System.out.println("Enter your processor Name");
				processor.setName(sc.next());
				
				System.out.println("Enter your processor Speed");
				processor.setSpeed(sc.nextInt());
				
				System.out.println("Enter your processor core ");
				processor.setCore(sc.next());
				
				
				
				laptop.setProcessor(processor);
				
				service.updateAllDao(id, laptop, processor);
			}
			break;
			case 4:{
				System.out.println("Enter your processor Old Id");
				int id=sc.nextInt();
				service.delteDao(id);
			}
			break;
			case 5:{
				
				for(Laptop list:service.Dispaly()) {
					
					System.out.println(list.getId());
					System.out.println(list.getLname());
					System.out.println(list.getPrice());
					System.out.println(list.getProcessor()); 
					
					System.out.println("........................");
					
					System.out.println(list.getProcessor().getId());
					System.out.println(list.getProcessor().getName());
					System.out.println(list.getProcessor().getSpeed());
					System.out.println(list.getProcessor().getCore());
					
					System.out.println("=======================================");
				}
			}
			break;
			
			}
		}

	}

}
