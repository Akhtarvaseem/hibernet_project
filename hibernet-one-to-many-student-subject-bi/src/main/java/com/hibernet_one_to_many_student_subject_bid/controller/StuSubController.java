package com.hibernet_one_to_many_student_subject_bid.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hibernet_one_to_many_student_subject_bid.dto.Student;
import com.hibernet_one_to_many_student_subject_bid.dto.Subject;
import com.hibernet_one_to_many_student_subject_bid.service.StuSubService;

public class StuSubController {

	public static void main(String[] args) {
		
		 StuSubService service= new StuSubService();
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
				 subject=new Subject();
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
					System.out.println("Enter subject Code ");
					subject.setCode(sc.nextInt());
					System.out.println("Enter subject Code ");
					subject.setName(sc.next());
					
					list.add(subject);
				}
				student.setSubject(list);
				
				service.insertSubStu(student, list);
				
			}
			break;
			case 2:{
				
				
				
			}
			break;
			case 3:{
				
				
				
			}
			break;
			case 4:{
				
				
				
			}
			break;
			}
			
			
		}

	}

}
