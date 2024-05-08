package com.jsp.hibernet_project_car_custmer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernet_project_car_custmer.dto.Car;
import com.jsp.hibernet_project_car_custmer.dto.CarBooked;

import com.jsp.hibernet_project_car_custmer.dto.Persion;

public class CarBookedDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	 
	public void insertBooked(CarBooked carBook) {
		
		entityTransaction.begin();
		entityManager.persist(carBook);
		entityTransaction.commit();
	   
		System.out.println(" Car and persion  insert successfully ...");
	}
	
	public List<CarBooked> getAllDetails(){
		
		String select="select c From CarBooked c";
		Query query=entityManager.createQuery(select);
		return query.getResultList();
	}
}
