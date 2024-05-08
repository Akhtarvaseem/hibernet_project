package com.jsp.simple_project_servlet.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.simple_project_servlet.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entiyTransaction=entityManager.getTransaction();
	
	public void insertEmployee(Employee employee) {
		entiyTransaction.begin();
		entityManager.persist(employee);
		entiyTransaction.commit();
		
		System.out.println("Sucessfully Inserted ");
	}
	

	
}
