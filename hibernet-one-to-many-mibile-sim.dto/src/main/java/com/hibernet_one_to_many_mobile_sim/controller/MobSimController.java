package com.hibernet_one_to_many_mobile_sim.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hibernet_one_to_many_mobile_sim.dao.MobSimDao;
import com.hibernet_one_to_many_mobile_sim.dto.Mobile;
import com.hibernet_one_to_many_mobile_sim.dto.Sim;
import com.hibernet_one_to_many_mobile_sim.service.MobSimService;

public class MobSimController {

	public static void main(String[] args) {
		
		
		MobSimService service=new MobSimService();
		Mobile mobile=new Mobile();
		
		while(true) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("1.Insert \n2.Update \n3.Delete\n4. Dispaly \n5.Update not all");
			System.out.println("Enter your choice....");
			
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:{
				System.out.println("How item are you want to add ? ");
				
				List<Sim> list=new ArrayList<Sim>();
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
				
                System.out.println("Enter here Mobile data ..");
				
				System.out.println("Enter your mobile id ");
				mobile.setId(sc.nextInt());
				
				System.out.println("Enter your mobile brand ");
				mobile.setMobileBrand(sc.next());
				
				System.out.println("Enter your mobile camera ");
				mobile.setMobileCamra(sc.next());
				
				System.out.println("Enter your mobile price ");
				mobile.setMobilePrice(sc.nextInt());
				
				mobile.setSim(list);
				
				service.simMobileInsert(list, mobile);
				
			}
			break;
			case 2:{
				
					Sim sim;
			        	
				System.out.println("Enter your mobile id ");
				mobile.setId(sc.nextInt());
				
				System.out.println("Enter your mobile brand ");
				mobile.setMobileBrand(sc.next());
				
				System.out.println("Enter your mobile price ");
				mobile.setMobilePrice(sc.nextInt());
				
				System.out.println("=========");
				System.out.println("How item are you want to add ? ");
				
				List<Sim> list=new ArrayList<Sim>();
				int size=sc.nextInt();
				
				for(int i=0;i<size;i++) {
					sim=new Sim();
					System.out.println("Enter your Sim id ");
					sim.setId(sc.nextInt());
					
					System.out.println("Enter Sim Name ");
					sim.setSimName(sc.next());
					
					System.out.println("Enter your NetWork type ");
					sim.setNetworkType(sc.next());
					
					list.add(sim);
				}
				mobile.setSim(list);
				
				service.updateMobSim(mobile, list);
				
			}
			break;
			case 3:{
				System.out.println("Enter your mobile id ");
				int mId=sc.nextInt();
				service.deleteMobileSim(mId);
			}
			break;
			case 4:{
				
				List<Mobile> list=service.displayMobSim();
				
				for (Mobile mobile2 : list) {
					
					System.out.println(mobile2.getId());
					System.out.println(mobile2.getMobileBrand());
					System.out.println(mobile2.getMobileCamra());
					System.out.println(mobile2.getMobilePrice());
					
					System.out.println("---------------------------");
					
					List<Sim> sim=mobile2.getSim();
					
					for (Sim sim2 : sim) {
						System.out.println(sim2.getId());
						System.out.println(sim2.getSimName());
					    System.out.println(sim2.getNetworkType());
					    System.out.println(sim2.getSize());
					    
					    System.out.println("======================================");
					}
					

				}
			}
			break;
			case 5:{
				
				System.out.println("Enter your mobile id ");
				int mobileId=sc.nextInt();
				
				System.out.println("Enter your mobile brand ");
				String bmobBrand=sc.next();
				
				
				System.out.println("Enter your Sim id ");
				int Simid=sc.nextInt();
		
				System.out.println("Enter your NetWork type ");
				String simType=sc.next();
				
				service.updateMobile(mobileId, Simid, bmobBrand, simType);
			}
			break;
			}
			
		}
		
		

	}

}
