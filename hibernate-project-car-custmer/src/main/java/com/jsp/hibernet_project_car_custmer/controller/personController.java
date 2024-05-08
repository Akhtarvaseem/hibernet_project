package com.jsp.hibernet_project_car_custmer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.hibernet_project_car_custmer.dto.Address;
import com.jsp.hibernet_project_car_custmer.dto.Car;
import com.jsp.hibernet_project_car_custmer.dto.Pan;
import com.jsp.hibernet_project_car_custmer.dto.Persion;
import com.jsp.hibernet_project_car_custmer.service.PersionService;

public class personController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		Persion persion=new Persion();
		Pan pan= new Pan();
		Address address=new Address();
		PersionService service=new PersionService();
		
		while(true) {
			System.out.println("1.Insert \n2.update \n3.delete");
			System.out.println(" Enter your choice..");
			
			int ch=sc.nextInt();
			switch(ch) {
			
			case 1:{
				
				System.out.println(" Enter here Pan Details.....");
				
				System.out.println(" Enter pan id ");
				pan.setId(sc.nextInt());
				
				System.out.println(" Enter pan panNumber ");
				pan.setPanNum(sc.next());
				
				System.out.println(" Enter pan DOB ");
				pan.setDOB(sc.next());
				
				System.out.println(" Enter pan Gender ");
				pan.setGender(sc.next());

				System.out.println(" Enter here Address Details......");
				
				System.out.println(" Enter Address id ");
				address.setId(sc.nextInt());
				
				System.out.println(" Enter Address CityName ");
				address.setCityName(sc.next());
				
				System.out.println(" Enter Address StreetName ");
				address.setStreetName(sc.next());
				
				System.out.println(" Enter Address FlatNo ");
				address.setFlatNo(sc.next());
				
				System.out.println(" Enter Address TwoName ");
				address.setTownname(sc.next());
				
			    System.out.println(" Enter here persion details......"); 
				
				System.out.println(" Enter persion id ");
				persion.setId(sc.nextInt());
				
				System.out.println(" Enter persion name ");
				persion.setName(sc.next());
				
				System.out.println(" Enter persion Phone number ");
				persion.setPhone(sc.nextLong());
				
				System.out.println(" Enter persion email ");
				persion.setEmail(sc.next());
					
		        
				pan.setAddress(address);
				persion.setAddress(address);
				persion.setPan(pan);

//				pan.setAddress(address);
				address.setPan(pan);
				service.insertPersion(pan, address, persion);
			}
			break;
			case 2:{
				
				System.out.println(" Enter persion id ");
				persion.setId(sc.nextInt());
				
				System.out.println(" Enter persion name ");
				persion.setName(sc.next());
				
				
				
				System.out.println(" Enter Address CityName ");
				address.setCityName(sc.next());
				
				System.out.println(" Enter pan panNumber ");
				pan.setPanNum(sc.next());
				
				service.updatePersion(pan, address, persion);
				
			}
			break;
			case 3:{
				
				System.out.println(" Enter persion id ");
				persion.setId(sc.nextInt());
				
				service.deletePersion(persion);
			}
			break;
			
			}
			
		}
		
		
	}

}
