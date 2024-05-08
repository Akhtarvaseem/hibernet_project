package com.jsp.hibernet_project_bus.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BusDisplay {

	public static void main(String[] args) {
		EntityManagerFactory  entityManagerFactory= Persistence.createEntityManagerFactory("akhtar");

	       EntityManager entityManager=entityManagerFactory.createEntityManager();
	       String select= "select s from Bus s";
	       
	          Query query= entityManager.createQuery(select);
	          
	          List<Bus> list=query.getResultList();
	          
	          for (Bus bus : list) {
				 
	        	  System.out.println("Bus number is "+bus.getBusNum());
	        	  System.out.println("Bus type is "+bus.getBusType());
	        	  System.out.println("Bus Passenger is"+bus.getPassengers());
			}
	       

	}

}
