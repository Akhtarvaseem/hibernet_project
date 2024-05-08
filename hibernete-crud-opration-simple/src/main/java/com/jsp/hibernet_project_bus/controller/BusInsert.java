package com.jsp.hibernet_project_bus.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernet_project_bus.dto.Bus;

public class BusInsert {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Bus bus=new Bus();
		
		bus.setBusNum(124);
		bus.setBusType("private");
		bus.setPassengers(789);
		
		entityTransaction.begin();
		entityManager.persist(bus);
		entityTransaction.commit();
		
		System.out.println("data inserted ....");
		
	}
	

}
