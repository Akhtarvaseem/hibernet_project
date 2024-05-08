package com.jsp.hibernet_many_to_many_techer_student_uni.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.hibernet_many_to_many_techer_student_uni.dto.Student;
import com.jsp.hibernet_many_to_many_techer_student_uni.dto.Teacher;
import com.jsp.hibernet_many_to_many_techer_student_uni.service.StudentTeacherService;

public class StudentTeacherController {

	public static void main(String[] args) {
		
		Teacher teacher=null;
		Student student=null;
		StudentTeacherService service=new StudentTeacherService();
		while(true) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("1.insert \n2. update \n3.delete \n4.display");
			System.out.println("Enter your choice..");
			
			int ch=sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("How offten details you want to add..");
				int size=sc.nextInt();
				List< Student> listStu=new ArrayList<Student>();
				List< Teacher> listTeach=new ArrayList<Teacher>();
				
				for(int i=0;i<size;i++) {
					
					student=new Student();
					System.out.println(" Enter Student details ");
					System.out.println("Enter student id");
					student.setsId(sc.nextInt());
					System.out.println("Enter Student name ");
					student.setName(sc.next());
					System.out.println("Enter student email ");
					student.setEmail(sc.next());
					System.out.println("Enter student breach");
					student.setBranch(sc.next());
					
					listStu.add(student);
					
				}
				
				
				for(int i=0;i<size;i++) {
					teacher=new Teacher();
                  System.out.println("Enter teacher details ");
					System.out.println("Enter teacher id");
					teacher.settId(sc.nextInt());
					System.err.println("Enter teacher name ");
					teacher.setName(sc.next());
					System.err.println("Enter teacher subject");
					teacher.setSubject(sc.next());
					
					System.out.println("Enter teacher experience");
					teacher.setExperience(sc.next());
					teacher.setStudent(listStu);
					
					listTeach.add(teacher);
				}
				service.studentTeacherInsert(listStu, listTeach);
			             
			}
			break;
			case 2:{
				
				System.out.println("Enter teacher details ");
				
				System.out.println("Enter teacher id");
				int teacherId=sc.nextInt();
				System.out.println("Enter teacher name ");
				String teacherName=sc.next();
				
				student=new Student();
				System.out.println(" Enter Student details ");
				System.out.println("Enter student id");
				int studentId=sc.nextInt();
				System.out.println("Enter Student name ");
				String studentName=sc.next();
				
				service.updateStudentTeacher(teacherId, studentId, teacherName, studentName);
			}
			break;
			case 3:{
//				List<Teacher> list=new ArrayList<Teacher>();
				
				System.out.println("Enter teacher id");
				 int id=sc.nextInt();
	
				
				service.deleteStudentTeacher(id);
			}
			break;
			case 4:{
				
				List<Teacher> list=service.dispStudentTeacher();
				for (Teacher teacher2 : list) {
					
					System.out.println(" Teacher details  ");
					System.out.println(teacher2.gettId());
					System.out.println(teacher2.getName());
					System.out.println(teacher2.getSubject());
					System.out.println(teacher2.getExperience());
					
					
					 List<Student> studetails=teacher2.getStudent();
					 for (Student detail : studetails) {
						System.out.println("................................");
						 System.out.println("Student details ");
						 System.out.println(detail.getsId());
						 System.out.println(detail.getName());
						 System.out.println(detail.getEmail());
						 System.out.println(detail.getBranch());
						 
						 System.out.println("................................");
					}
					
					
				}
			}
			break;
			}
		
		}
	}

}
