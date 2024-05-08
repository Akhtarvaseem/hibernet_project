package com.jsp.hibernet_project_car_custmer.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernet_project_car_custmer.dto.Car;
import com.jsp.hibernet_project_car_custmer.dto.Persion;


public class CarDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void insertCar(Car car) 
	{
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		System.out.println("Car and Persion Details inserted  sucessfully inserted ");
	}
	
         public List<Car> getAllCar(){
		 String select="Select s from Car s";
		 Query query=entityManager.createQuery(select);
		  return query.getResultList();
	 }
}
