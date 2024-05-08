package com.jsp.jdbc_crud_opration_statement.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.jdbc_crud_opration_statement.dto.Teacher;
import com.jsp.jdbc_crud_opration_statement.service.TeacherService;

public class TeacherController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Teacher teacher=new Teacher();
		
		TeacherService  teacherService=new TeacherService();
		
		while(true) {
			
			System.out.println("1.Insert teacher data\n2.Update teachers data\n3.Delete teachers data\n4.Dispaly teachers data\n5.exit");
		    System.out.println("Enter your choice....");
		    
		    int ch=sc.nextInt();
		    switch(ch) 
		    {
		     
			    case 1:
			    {
			    	System.out.println("Enter your id. ");
			    	teacher.setId(sc.nextInt());
			    	
			    	System.out.println("Enter your name ");
			    	teacher.setName(sc.next());
			    	
			    	System.out.println("Enter your email ");
			    	teacher.setEmail(sc.next());
			    	
			    	System.out.println("Enter your phone");
			    	teacher.setPhone(sc.nextLong());
			    		
			        teacherService.insertData(teacher);
			    }
			    break;
			    case 2:
			    {
			    	System.out.println("Enter your id. ");
			    	teacher.setId(sc.nextInt());
			    	
			    	System.out.println("Enter your name ");
			    	teacher.setName(sc.next());
			    	
			    	teacherService.updateData(teacher);
			    	
			    }
			    break;
			    case 3:
			    {
			    	System.out.println("Enter your id. ");
			    	teacher.setId(sc.nextInt());
			    	
			    	teacherService.deleteData(teacher);
			    	
			    }
			    break;
			    case 4:
			    {
			    	List<Teacher> teachers=teacherService.displayData();
			    	for(Teacher teacher2:teachers) {
			    		System.out.println(teacher2.getId());
			    		System.out.println(teacher2.getName());
			    		System.out.println(teacher2.getEmail());
			    		System.out.println(teacher2.getPhone());
			    	}
			    	System.out.println("-----------");
			    }
			    break;
			    
			    case 5:
			    {
			    
			    }
		     
		    }
		}

	}

	

}
