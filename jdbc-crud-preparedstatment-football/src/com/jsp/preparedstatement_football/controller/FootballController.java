package com.jsp.preparedstatement_football.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.preparedstatement_football.dto.Footbal;
import com.jsp.preparedstatement_football.service.FootballService;

public class FootballController {

	public static void main(String[] args) 
	{
	  	FootballService service=new FootballService();
	  	Footbal football= new Footbal();
	  	Scanner sc=new Scanner(System.in);
	  	
	  	while(true)
	  	{
	  		System.out.println("1.Insert \n2.Update \n3.Delete \n4.Display\n5.addBatchInsert \n6. Exit()");
	  		System.out.println("Enter Your Choice..... \n");
	  		
	  		int ch=sc.nextInt();
	  		switch (ch)
	  		{
			   case 1:
			   {
						System.out.println("Enter PalyerID  ");
						football.setPlayerId(sc.nextInt());
						
						System.out.println("Enter PlayerName ");
						football.setPlayerName(sc.next());
						
						System.out.println("Enter the PalyerGoal ");
						football.setPlayerGoal(sc.nextInt());
						
						service.footBallInsert(football);
				}
						
				break;
			   case 2:
			   {
				
				    System.out.println("Enter PalyerID  ");
					int id=sc.nextInt();
					
					System.out.println("Enter PlayerName ");
					String name=sc.next();
					
					System.out.println("Enter the PalyerGoal ");
					int goal=sc.nextInt();
					
					service.Update(id, name, goal);
			   }
               break;
			   case 3:
			   {
				   System.out.println("Enter PalyerID  ");
					int id=sc.nextInt();
					
					service.deleteData(id);
				   
			   }
			   break;
			   case 4:{
				      
				     List<Footbal> list=service.dispFootbal();
				     
				     for (Footbal footbal : list) {
						
				    	 System.out.println(footbal.getPlayerId());
				    	 System.out.println(footbal.getPlayerName());
				    	 System.out.println(footbal.getPlayerGoal());
					}
			   }
			   break;
			   case 5:{
				      List<Footbal> list=new ArrayList<Footbal>();
				      System.out.println("How you want to add data at a time ");
				      int size=sc.nextInt();
				      for (int i = 0; i < size; i++) 
				      {
						    Footbal football1=new Footbal();
				    	    System.out.println("Enter PalyerID  ");
							football1.setPlayerId(sc.nextInt());
							
							System.out.println("Enter PlayerName ");
							football1.setPlayerName(sc.next());
							
							System.out.println("Enter the PalyerGoal ");
							football1.setPlayerGoal(sc.nextInt());
							
							list.add(football1);
							
					 }
				      service.InsertAddBatch(list);
			   }
			   break;
			   case 6:{
				   System.out.println("Terminate your Programe..");
				   System.exit(0);
				   
			   }
			}
	  		
	  	}
	  	
     
	}
 
}
