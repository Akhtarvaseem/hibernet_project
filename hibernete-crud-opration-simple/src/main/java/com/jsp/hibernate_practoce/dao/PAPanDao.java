package com.jsp.hibernate_practoce.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_practoce.dto.Address;
import com.jsp.hibernate_practoce.dto.Pan;
import com.jsp.hibernate_practoce.dto.Persion;

public class PAPanDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insert(Persion p , Pan pan, Address ad) {
		
		entityTransaction.begin();
		entityManager.persist(p);
		entityManager.persist(pan);
		entityManager.persist(ad);
		
		entityTransaction.commit();
		
		System.out.println("Successfully..."); 
		
	}
	
	public void delete(int id) {
//		Persion p=entityManager.find(Persion.class, id);
//		Pan p1=entityManager.find(Pan.class, id);
		Address ad=entityManager.find(Address.class, id);
		entityTransaction.begin();
		entityManager.remove(ad);
		entityManager.remove(ad.getPersion());
		entityManager.remove(ad.getPersion().getPan());
		entityTransaction.commit();
	}
}
