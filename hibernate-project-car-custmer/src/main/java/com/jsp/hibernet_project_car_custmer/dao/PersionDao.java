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

public class PersionDao {

	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	public void insertPersion(Pan pan, Address addredss, Persion persion) {
        	
		entityTransaction.begin();

		entityManager.persist(pan);
		entityManager.persist(addredss);
		entityManager.persist(persion);
		entityTransaction.commit();
	   
		System.out.println(" Persion insert successfully ...");
	}
	
	
	// Update Pan ,address, Persion 
	public void updatePersion(Pan pan, Address address, Persion persion) {
		
		Persion persion1= entityManager.find(Persion.class, persion.getId());
		Address addredss1=persion1.getAddress();
		Pan pan1=persion1.getPan();

		entityTransaction.begin();
		
		
		persion1.setName(persion.getName());
		addredss1.setCityName(address.getCityName());
		pan1.setPanNum(pan.getPanNum());
		
		entityManager.persist(pan1);
		entityManager.persist(persion1);
		entityManager.persist(addredss1);
		
		
		entityTransaction.commit();
		
		System.out.println("update successfully ");
	}
	
	// Delete pan, address ,person
	
//	
	public void deletePersion(Persion persion) {
		Persion persion1= entityManager.find(Persion.class, persion.getId());
		
			
			entityTransaction.begin();
			entityManager.remove(persion1);
			entityManager.remove(persion1.getPan());
			entityManager.remove(persion1.getPan());
			entityTransaction.commit();
			System.out.println("Delete Successfully");
			
	
		
	}
	
	// Retrieve all details 
	 public List<Persion> getAllPersion()
	     {
		 String select="Select s from Persion s";
		 Query query=entityManager.createQuery(select);
		  return query.getResultList();
	 }
}
