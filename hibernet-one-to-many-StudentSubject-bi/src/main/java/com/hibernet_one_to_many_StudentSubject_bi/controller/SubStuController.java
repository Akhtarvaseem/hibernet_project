package com.hibernet_one_to_many_StudentSubject_bi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hibernet_one_to_many_StudentSubject_bi.dto.Student;
import com.hibernet_one_to_many_StudentSubject_bi.dto.Subject;
import com.hibernet_one_to_many_StudentSubject_bi.service.SubStuService;


public class SubStuController {

	
	public static void main(String[] args) {
		
		SubStuService service= new SubStuService();
		 Subject subject=null;
		 Student student=null;
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Insert \n2.Update \n3.Delete \n4.Display");
			System.out.println("Enter your choice ...");
			int ch=sc.nextInt();
			
			List<Subject> list=new ArrayList<Subject>();
			switch(ch) {
			
			case 1:{
				 student=new Student();
				  
				 System.out.println("Enter Student id ");
				 student.setId(sc.nextInt());
				 
				 System.out.println("Enter Student Name ");
				 student.setName(sc.next());
				 
				 System.out.println("Enter Student Course ");
				 student.setCourse(sc.next());
				 
				System.out.println(" Enter your subject ");
				
				System.out.println("How many data you want to add ");
				int size= sc.nextInt();
				
				for(int i=0;i<size;i++) {
					subject=new Subject();
					System.out.println("Enter subject Code ");
					subject.setCode(sc.nextInt());
					System.out.println("Enter subject Name ");
					subject.setName(sc.next());
					
					list.add(subject);
				    
					subject.setStudent(student);
//					student.setSubject(list); 
			}
				
				
				service.insertSubStu(student,list);
				
			}
			break;
			case 2:{
				System.out.println("Enter subject id ");
				int id=sc.nextInt();
				
				 System.out.println("Enter Student Name ");
				 String Stu=sc.next();
				
				System.out.println("Enter subject Name ");
				String Sub=sc.next();
				
				service.updateSubStu(id, Stu, Sub);
				
			}
			break;
			case 3:{
				
				System.out.println("Enter subject id ");
				int id=sc.nextInt();
				
				service.deleteSubStu(id);
				
			}
			break;
			case 4:{
				
				List<Subject> list1=service.displaySubStu();
			    
				Student student1=null;
				for (Subject subject2 : list1) {
					
					System.out.println(subject2);
					student1 =subject2.getStudent();
				}
				System.out.println(student1);
		
			}
			break;
			}
			
			
		}

	}

}
