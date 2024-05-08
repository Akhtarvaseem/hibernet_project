package com.jsp.hibernet_project_car_custmer.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernet_project_car_custmer.dto.Address;
import com.jsp.hibernet_project_car_custmer.dto.Car;
import com.jsp.hibernet_project_car_custmer.dto.Pan;
import com.jsp.hibernet_project_car_custmer.dto.Persion;

public class PanDao {

//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction= entityManager.getTransaction();
//	
//	public void insertPan(Pan pan, Address addredss,Persion persion) {
////		Persion person=entityManager.find(Persion.class,personId);
//        
//		
//		entityTransaction.begin();
////		person.setId(personId);
//		entityManager.persist(pan);
////		entityManager.persist(car);
//		entityManager.persist(addredss);
//		entityManager.persist(persion);
//		
//		entityTransaction.commit();
//	   
//		System.out.println(" Pan insert successfully ...");
//	}
//	
//	
//	 public List<Pan> display(){
//		 String select="Select s from Pan s";
//		 Query query=entityManager.createQuery(select);
//		 
//		  return query.getResultList();
//	 }
}
