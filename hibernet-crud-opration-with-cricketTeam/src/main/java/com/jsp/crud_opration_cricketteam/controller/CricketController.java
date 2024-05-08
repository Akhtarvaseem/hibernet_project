package com.jsp.crud_opration_cricketteam.controller;

import java.util.Scanner;
import com.jsp.crud_opration_cricketteam.dto.CricketTeam;
import com.jsp.crud_opration_cricketteam.service.CricketService;

public class CricketController {

	public static void main(String[] args) {
		   CricketTeam team;
		   CricketService service=new CricketService();
		   
           while(true) 
           {
        	System.out.println("1.Insert \n2.Update \n3.Delete \n4.Dispaly \n5.Exit");
        	System.out.println("Enter your Choice");
        	Scanner sc=new Scanner(System.in);
        	int ch=sc.nextInt();
        	
        	switch(ch) {
        	
        	case 1:{
        		team=new CricketTeam();
        		System.out.println("Enter your TeamId ");
        		team.setTeamId(sc.nextInt());
        		
        		System.out.println("Enter your Team Name ");
        		team.setTeamName(sc.next());
        		
        		System.out.println("Enter your Team Caption ");
        		team.setTeamCaptain(sc.next());
        		
        		System.out.println("Enter your Team Coach");
        		team.setTeamCoach(sc.next());
        		
        		service.insertDao(team);
        	}
        	break;
        	case 2:{
        		
        		
        		System.out.println("1.updateAllData \n2.UpdateTeamName \n3.UpdateTeacmCation \n4.TeamCoach \n5.Exit");
            	System.out.println("Enter your Choice");
            	
            	int ch1=sc.nextInt();
            	switch(ch1) {
            	case 1:{
            		team=new CricketTeam();
             		System.out.println("Enter your TeamId ");
             		int id=sc.nextInt();
             		
             		System.out.println("Enter your Team Name ");
             		team.setTeamName(sc.next());
             		
             		System.out.println("Enter your Team Caption ");
             		team.setTeamCaptain(sc.next());
             		
             		System.out.println("Enter your Team Coach");
             		team.setTeamCoach(sc.next());
             		service.updateDao(id,team);
            	}
            	break;
            	case 2:{
            		team=new CricketTeam();
             		System.out.println("Enter your TeamId ");
             		int id=sc.nextInt();
             		
             		System.out.println("Enter your Team Name ");
             		team.setTeamName(sc.next());
             		
             		service.updateDao(id,team);
            	}
            	break;
            	case 3:{
            		team=new CricketTeam();
             		System.out.println("Enter your TeamId ");
             		int id=sc.nextInt();
             		
             		
             		System.out.println("Enter your Team Caption ");
             		team.setTeamCaptain(sc.next());
             		
             		service.updateDao(id,team);
            	}
            	break;
            	case 4:{
            		team=new CricketTeam();
             		System.out.println("Enter your TeamId ");
             		int id=sc.nextInt();
             		
             		System.out.println("Enter your Team Coach");
             		team.setTeamCoach(sc.next());
             		service.updateDao(id,team);
            	}
            	break;
            	
            	}
        		
            	// inner switch loop exit.
        	}
        	break;
        	case 3:{
        		System.out.println("Enter your TeamId ");
        		service.deleteDao(sc.nextInt());
        	}
        	break;
        	case 4:{
        		 
        		 for (CricketTeam list : service.dispalyDao()) {
					
        			 System.out.println(list.getTeamId());
        			 
        			 System.out.println(list.getTeamName());
        			 System.out.println(list.getTeamCaptain());
        			 
        			 System.out.println(list.getTeamCoach());
        			 
        			 System.out.println("=============================");
				}
        	}
        	break;
        	case 5:{
        		System.out.println("Exit loop...");
        		System.exit(0);
        	}
        	break;
        	}
        	
        	
           }
	}

}
