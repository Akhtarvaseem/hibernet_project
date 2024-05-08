package com.jsp.hibernet_project_bus.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BusUpdate {

	public static void main(String[] args) {
		

		EntityManagerFactory  entityManagerFactory= Persistence.createEntityManagerFactory("akhtar");

       EntityManager entityManager=entityManagerFactory.createEntityManager();
       
       EntityTransaction entityTransaction=entityManager.getTransaction();
       
       Bus bus=entityManager.find(Bus.class, 123);
       
       if(bus!=null) {
    	    bus.setBusType("public");
    	    bus.setPassengers(77);
    	    
    	    entityTransaction.begin();
    	    entityManager.merge(bus);
    	    entityTransaction.commit();
    	    
    	    System.out.println("Update done...");
       }
	
	}

}
