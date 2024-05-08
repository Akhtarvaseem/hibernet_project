package com.hibernet_one_to_many_mobile_sim.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernet_one_to_many_mobile_sim.dto.Mobile;
import com.hibernet_one_to_many_mobile_sim.dto.Sim;

public class MobileDao {

   EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("akhtar");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertMobile(Mobile mobile) {
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityTransaction.commit();
		
	}
	
	
	
	// get the all sim details 
	
		public List<Sim> getAllSims(){
			
			String select= "select s from Sim s";
			
			Query query= entityManager.createQuery(select);
			
//			return entityManager.createQuery(select, Sim.class).getResultList();
			 return query.getResultList();
			
			 
		}
		
// updateMobile Data from database
	
		public void updateMobile( Mobile mobile) {
			
			Mobile mobile2=entityManager.find(Mobile.class, mobile.getId());
			
			if(mobile2!=null) {
				mobile2.setMobileBrand(mobile.getMobileBrand());
				mobile2.setMobilePrice(mobile.getMobilePrice());
				entityTransaction.begin();
				entityManager.merge(mobile2);
				entityTransaction.commit();
			}
			System.out.println("SuccessFully Updated .");
		}
	
// deleteMobile Data form data table
      public void deleteMobile(int id) {
		
		Mobile mobile=entityManager.find(Mobile.class, id); 
		if(mobile!=null){
			entityTransaction.begin();
			entityManager.remove(mobile);
			entityTransaction.commit();
			
		}
		System.out.println("Delete SucessFully...");
	}
	 
}
