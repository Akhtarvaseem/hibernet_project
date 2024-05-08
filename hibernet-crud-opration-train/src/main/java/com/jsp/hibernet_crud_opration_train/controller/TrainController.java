package com.jsp.hibernet_crud_opration_train.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.hibernet_crud_opration_train.dto.Train;
import com.jsp.hibernet_crud_opration_train.service.TrainService;

public class TrainController {

	public static void main(String[] args) {
		
		Train train=new Train();
		TrainService trainService=new TrainService();
		
        while(true) {
        	
        	System.out.println("1.Insert \n2.Update \n3.Delete \n4.Dispaly \n5.deleteJPQLtoPosition \n6.deleteToNameQuery \n.Exit");
        	System.out.println("Enter your Choice");
        	Scanner sc=new Scanner(System.in);
        	int ch=sc.nextInt();
        	
        	switch(ch) {
        	case 1:{
        		System.out.println("Enter Train number ");
        		train.setTrianNo(sc.nextInt());
        		
        		System.out.println("Enter train name ");
        		train.setTrainName(sc.next());
        		
        		System.out.println("Enter train distnation ");
        		train.setDistnation(sc.next());
        		
        		trainService.trainInsert(train);
        	}
        	break;	
        	case 2:{
        		
        		System.out.println("Enter Train number ");
        		train.setTrianNo(sc.nextInt());
        		
        		System.out.println("Enter train name ");
        		train.setTrainName(sc.next());
        		
        		System.out.println("Enter train distnation ");
        		train.setDistnation(sc.next());
        		
        		trainService.trainUpdate(train);
        		
        		
        	}
        	break;
        	case 3:{
        		
        		System.out.println("Enter Train number ");
        		
        		trainService.trainDelete(sc.nextInt());
        	}
        	break;
        	case 4:{
        		
        		 List<Train> list=trainService.trainDisplay();
        		for (Train train2 : list) {
					
        			System.out.println(train2.getTrianNo());
        			
        			System.out.println(train2.getTrainName());
        			
        			System.out.println(train2.getDistnation());
        			
        			System.out.println("===============================");
				}
        	}
        	break;
        	case 5:{
        		System.out.println("Enter Train number ");
        		int id=sc.nextInt();
        		trainService.deleteJPQL(id);
        	}
        	case 6:{
        		System.out.println("Enter Train number ");
        		int id=sc.nextInt();
        		trainService.deleteJPQL(id);
        	}
        	case 7:{
        		System.out.println("Controle goes to out of programe");
        		System.exit(0);
        	}
        	break;
        	}
        }
		
	}

}
