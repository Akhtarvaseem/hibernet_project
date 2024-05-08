package com.hibernate_one_to_one_Contry_Capital_Bi.controller;

import java.util.List;
import java.util.Scanner;

import com.hibernate_one_to_one_Contry_Capital_Bi.dto.Capital;
import com.hibernate_one_to_one_Contry_Capital_Bi.dto.Country;
import com.hibernate_one_to_one_Contry_Capital_Bi.service.capCountryService;

public class capCountryController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Country country=null;
		Capital capital=null;
		capCountryService service= new capCountryService();
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			
			System.out.println("1.insert \n2. update \n3.delete \n4.display");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch) {
			
			case 1:{
				
				country=new Country();
			   capital=new Capital();
			   System.out.println("Enter country id");
				country.setId(sc.nextInt());
				
				System.out.println("Enter country name");
				country.setName(sc.next());
				
				System.out.println("Enter country population in long");
				country.setPopulation(sc.nextLong());
				
				System.out.println("Enter country area in double ");
				country.setArea(sc.nextDouble());
				
				System.out.println("Enter capital details");
				
				System.out.println("Enter captial id ");
				capital.setId(sc.nextInt());
				
				System.out.println("Enter captial name ");
				capital.setName(sc.next());
				
				System.out.println("Enter captial population ");
				capital.setPopulation(sc.nextLong());
				
				country.setCapital(capital);
				
				service.insertCapCon(country, capital);
			}
			break;
			case 2:
			{
				System.out.println("Enter capital id");
				int id=sc.nextInt();
				
				System.out.println("Enter country name");
				String countryName=sc.next();
				
				System.out.println("Enter captial name ");
				String captialName=sc.next();
				
				service.updateCapCountry(id, captialName, countryName);
			}
			break;
			case 3:
			{
				System.out.println("Enter capital id");
				int id=sc.nextInt();
				
				service.deleteCapCountry(id);
				
			}
			break;
			case 4:
			{
				List<Capital> list=service.DisplyCapCoun();
				
				for (Capital capital2 : list) {
					
					System.out.println(capital2);
					System.err.println(capital2.getCountry());
				}
			}
			break;
			
			}
		}
		
	}

}
