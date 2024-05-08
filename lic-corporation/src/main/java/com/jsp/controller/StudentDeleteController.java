package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bean.Student;

public class StudentDeleteController {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student student=entityManager.find(Student.class, 1235);
		
		if(student!=null) {
			
			entityTransaction.begin();
			
			
			entityManager.remove(student);
			
			
			entityTransaction.commit();
			
			System.out.println("Your data has been deleted successfully....");
		}
		
		
		else {
			System.out.println("sorry! apna Id sahi karo...");
		}

	}

}
