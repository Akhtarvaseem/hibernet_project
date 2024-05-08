package com.jsp.jdbc_crud_with_statement.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.jdbc_crud_with_statement.dto.Custmer;
import com.jsp.jdbc_crud_with_statement.service.CustmerService;

public class CustmerController {

	public static void main(String[] args) {
		Custmer custmer=new Custmer();
		CustmerService custmerservice= new CustmerService();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.Insert custmer data\n2.Update custmer data\n3.Delete custmer data\n4.Dispaly custmer data\n5.exit");
            System.out.println("Enter your choice....");	
            
            
            int ch=sc.nextInt();
            
             
            
            switch(ch) {
            case 1:{
            	System.out.println("Enter your id. ");
		    	custmer.setCustmerId(sc.nextInt());
		    	
		    	System.out.println("Enter your name ");
		    	custmer.setCustmerName(sc.next());
		    	
		    	System.out.println("Enter your email ");
		    	custmer.setCustmerEmail(sc.next());
		    	
		    	custmerservice.insertCustmer(custmer);
		    	break;
            }
            case 2:
            {
            	System.out.println("Enter your id. ");
		    	 int id=sc.nextInt();
		    	
		    	System.out.println("Enter your name ");
		    	String name=sc.next();
		    	
		    	custmerservice.custmerUpdate(name,id);
            }
            break;
            case 3:{
            	System.out.println("Enter your id. ");
		    	 int id=sc.nextInt();
		    	 
            	custmerservice.custmerDelete(id);
            }
            break;
            case 4:
            {
            	List<Custmer> custmer2=custmerservice.custmerDisplay(custmer);
            	System.out.println("==========================");
            	
            	for(Custmer cusDetail:custmer2 ) {
            		
            		System.out.println(cusDetail.getCustmerId());
            		System.out.println(cusDetail.getCustmerName());
            		System.out.println(cusDetail.getCustmerEmail());
            		System.out.println("----------");
            	}
            	
            	System.out.println("==========================\n");
            }
            break;
            }
		}
      	

	}

}
