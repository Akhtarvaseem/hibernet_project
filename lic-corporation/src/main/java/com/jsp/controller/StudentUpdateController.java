package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bean.Student;

public class StudentUpdateController {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		  Student student=entityManager.find(Student.class, 1233);
		  
		  if(student!=null) {
			  student.setName("Faizan");
			  student.setEmail("faizan@gamil.com");
			  
			  entityTransaction.begin();
			  entityManager.merge(student);
			  entityTransaction.commit(); 
		  }
		  System.out.println("SuccessFully Updatedd...");
	}
}
