package com.hibernet_one_to_many_mobile_sim.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hibernet_one_to_many_mobile_sim.dto.Mobile;
import com.hibernet_one_to_many_mobile_sim.dto.Sim;

import com.hibernet_one_to_many_mobile_sim.service.SimService;

public class SimController {

	public static void main(String[] args) {
		

		
		
		SimService service=new SimService();
		Mobile mobile=null;
		List<Sim> list=new ArrayList<Sim>();
		
		while(true) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("1.Insert \n2.Update \n3.Delete\n4. Dispaly");
			System.out.println("Enter your choice....");
			
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:{
				System.out.println("How item are you want to add ? ");
				int size=sc.nextInt();
				mobile=new Mobile();
				for(int i=0;i<size;i++) 
				{
					Sim sim=new Sim();
					
					System.out.println("Enter your Sim id ");
					sim.setId(sc.nextInt());
					
					System.out.println("Enter Sim Name ");
					sim.setSimName(sc.next());
					
					System.out.println("Enter your NetWork type ");
					sim.setNetworkType(sc.next());
					
					System.out.println("Enter your Sim size ");
					sim.setSize(sc.next());
					
					
					
					list.add(sim);
				}
				service.simInsert(list);
				
			}
			break;
			case 2:{
				
				Sim sim=new Sim();
				System.out.println("Enter your Sim id ");
				sim.setId(sc.nextInt());
				
				System.out.println("Enter Sim Name ");
				sim.setSimName(sc.next());
				
				System.out.println("Enter your NetWork type ");
				sim.setNetworkType(sc.next());
			
				service.updateSim(sim);
			}
			break;
			case 3:{
				System.out.println("Enter your Sim id ");
				int id=sc.nextInt();
				service.deleteSim(id);
			}
			break;
			case 4:{
				
			}
			}
			
		}
		
		

	}

}
