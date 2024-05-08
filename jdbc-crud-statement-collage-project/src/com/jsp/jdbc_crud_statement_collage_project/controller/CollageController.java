package com.jsp.jdbc_crud_statement_collage_project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.jdbc_crud_statement_collage_project.dto.College;
import com.jsp.jdbc_crud_statement_collage_project.service.CollegeService;

public class CollageController {

	public static void main(String[] args) {
      CollegeService service = new CollegeService();
      College college=new College();
      Scanner sc=new Scanner(System.in);
     
      while(true)
      {
    	  System.out.println("1.Insert\n2.Insert by AddBatch\n3.Update\n4.Delete\n5.Display");
          System.out.println("=================================");
          System.out.println("Choose your choice");
          int ch= sc.nextInt();
    	  switch(ch)
    	  {
    	  case 1:
    	   {
    		  System.out.println("Enter college id");
    		  college.setId(sc.nextInt());
    		  System.out.println("Enter college Name");
    		  college.setName(sc.next());
    		  System.out.println("Enter college Location");
    		  college.setLocation(sc.next());
    		  System.out.println("Enter college's Department");
    		  college.setDepartment(sc.nextInt());
    		  
    		  service.insertDao(college);
    		  
    	   }
    	   break;
    	  case 2:
    	  {
    		  
    		   List<College> list= new ArrayList<College>();
    		   System.out.println(" How you want to add data..");
    		   int size=sc.nextInt();
    		   
    		   for(int i=0;i<size;i++) 
    		   {
    			   College college1=new College();

    	    		  System.out.println("Enter college id");
    	    		  college1.setId(sc.nextInt());
    	    		  System.out.println("Enter college Name");
    	    		  college1.setName(sc.next());
    	    		  System.out.println("Enter college Location");
    	    		  college1.setLocation(sc.next());
    	    		  System.out.println("Enter college's Department");
    	    		  college1.setDepartment(sc.nextInt());
    			   
    	    		  list.add(college1);
    		   }
    		     service.insertAddBatch(list);
    		   
    	  } 
    	  break;
    	  case 3:
    	  {
    		  
    		  System.out.println("Enter the college id");
    		  college.setId(sc.nextInt());
    		  
    		  System.out.println("Enter the college name");
    		  college.setName(sc.next());
    		  
    		  System.out.println("Enter the college location");
    		   college.setLocation(sc.next());
    		
    		   service.collegeUpdate(college);
    	  }
    	  break;
    	  case 4:
    	  {
    		  System.out.println("Enter the college id");
    		  college.setId(sc.nextInt());
    		  service.collegeDelete(college);
    	  }
    	  break;
    	  case 5:
    	  {
    		  
    		  List<College> list1=service.collegeDisplay(college);
    		  System.out.println("==========================");
    		  for (College college2 : list1) 
    		  {
				System.out.println(college2.getId());
				System.out.println(college2.getName());
				System.out.println(college2.getLocation());
				System.out.println(college2.getDepartment());
				System.out.println("----------");
			 }
    		  System.out.println("==========================");
    	   }

    	  break;
    	  }
      }
    	  

	}

}
