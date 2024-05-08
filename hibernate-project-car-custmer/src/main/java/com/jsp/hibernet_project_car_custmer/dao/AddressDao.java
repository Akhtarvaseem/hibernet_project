package com.jsp.hibernet_project_car_custmer.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernet_project_car_custmer.dto.Address;
import com.jsp.hibernet_project_car_custmer.dto.Pan;
import com.jsp.hibernet_project_car_custmer.dto.Persion;

public class AddressDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
//	public void insertAddress(Address address) {
//		
//		entityTransaction.begin();
//		Pan pan=address.getPan();
//		Persion persion=address.getPersion();
//		
//		entityManager.persist(pan);
//		entityManager.persist(address);
//		entityManager.persist(persion);
//		
//		entityTransaction.commit();
//	   
//		System.out.println(" address , pan and persion  insert successfully ...");
//	}
}
