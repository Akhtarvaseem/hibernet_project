package com.hibernet_one_to_many_mobile_sim.controller;

import java.util.List;
import java.util.Scanner;

import com.hibernet_one_to_many_mobile_sim.dao.MobSimDao;
import com.hibernet_one_to_many_mobile_sim.dto.Mobile;
import com.hibernet_one_to_many_mobile_sim.dto.Sim;
import com.hibernet_one_to_many_mobile_sim.service.MobileService;

public class MobileController {

	public static void main(String[] args) {
		
		Mobile mobile=null;
		MobSimDao dao2=new MobSimDao();
	  
		List<Sim> sim= dao2.getAllSims();
		
		MobileService service= new MobileService();
		while(true) {
            Scanner sc=new Scanner(System.in);
			
			System.out.println("1.Insert \n2.Update \n3.Delete\n4. Dispaly");
			System.out.println("Enter your choice....");
			
			int ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:{
				
				mobile=new Mobile();
				System.out.println("Enter here Mobile data ..");
				
				System.out.println("Enter your mobile id ");
				mobile.setId(sc.nextInt());
				
				System.out.println("Enter your mobile brand ");
				mobile.setMobileBrand(sc.next());
				
				System.out.println("Enter your mobile camera ");
				mobile.setMobileCamra(sc.next());
				
				System.out.println("Enter your mobile price ");
				mobile.setMobilePrice(sc.nextInt());
				
				mobile.setSim(sim);
				service.insertMobile(mobile);
			}
			break;
			case 2:{
				mobile=new Mobile();
				System.out.println("Enter your mobile id ");
				mobile.setId(sc.nextInt());
				
				System.out.println("Enter your mobile brand ");
				mobile.setMobileBrand(sc.next());
				
				System.out.println("Enter your mobile price ");
				
				mobile.setMobilePrice(sc.nextInt());
				
				service.updateMobile(mobile);
				
			}
			break;
			case 3:{
				
				System.out.println("Enter your mobile id ");
				int id=sc.nextInt();
				
				service.deleteMobile(id);
				
			}
			break;
			}
			
		}
		
		
		
		
	}
}
