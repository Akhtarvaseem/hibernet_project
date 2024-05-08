package com.jsp.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.bean.Student;

public class StudentDispalyController {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		String select="Select s From Student s";
		
		Query query=entityManager.createQuery(select);
		
		 List<Student>  list= query.getResultList();
		 
         for (Student student : list) {
        	 
			System.out.println("student_Id "+ student.getId());
			System.out.println("student_email"+student.getEmail());
			System.out.println("student_name "+ student.getName());
		
			
		}
		 
	}

}
