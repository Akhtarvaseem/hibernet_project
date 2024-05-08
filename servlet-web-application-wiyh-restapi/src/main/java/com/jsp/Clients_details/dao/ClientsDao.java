package com.jsp.Clients_details.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Clients_details.dto.Clients;

public class ClientsDao {
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertData(Clients client) {
		
		entityTransaction.begin();
		entityManager.persist(client);
		entityTransaction.commit();
		
		System.out.println("Successfully inserted ");
	}

}
