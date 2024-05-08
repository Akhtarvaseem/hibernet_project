package com.jsp.one_to_one_LaptopProceser_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.one_to_one_LaptopProceser_uni.dto.Laptop;
import com.jsp.one_to_one_LaptopProceser_uni.dto.Processor;

public class LapProDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertDao(Laptop laptop ,Processor processor) {
		
		entityTransaction.begin();
		entityManager.persist(processor);
		
		entityManager.persist(laptop);
		
		entityTransaction.commit();
		
		System.out.println("Sucessfully Inserted  ");
	}
	
	
	// Update only some particular data
	
	public void updateDao(int id, Double price, String core) {
		
		Laptop laptop=entityManager.find(Laptop.class,id);
			
		Processor processor=laptop.getProcessor();
		
		if(laptop!=null) {
	
			laptop.setPrice(price);
			processor.setCore(core);
			entityTransaction.begin();
			entityManager.merge(laptop);
			entityManager.merge(processor);
			entityTransaction.commit();
		
		}
		
		System.out.println("Successfully Update...  ");
	}
	
	// update all things in lapPro
	public void updateAllDao(int id, Laptop laptop, Processor processor) {
		
		Laptop laptop1=entityManager.find(Laptop.class,id);
		Processor processor1=laptop1.getProcessor();
		
		if(laptop!=null) {
			laptop1.setLname(laptop.getLname());
			laptop1.setPrice(laptop.getPrice());
			laptop1.setProcessor(processor1);
			
			
//			processor1.setId(processor.getId());
			processor1.setName(processor.getName());
			processor1.setSpeed(processor.getSpeed());
			processor1.setCore(processor.getCore());
			
			
			
			entityTransaction.begin();
			entityManager.merge(laptop1);
			entityManager.merge(processor1);
			entityTransaction.commit();
			
		}
		
		System.out.println("Sucessfully Update...  ");
	}
	
	public void delteDao(int id) {
		
		Laptop laptop=entityManager.find(Laptop.class,id);
		
		Processor processor=laptop.getProcessor();
		
		if(laptop!=null) {
			
			entityTransaction.begin();
			if(processor!=null) {
				entityManager.remove(processor);
			}
			
			entityManager.remove(laptop);
			
			entityTransaction.commit();
			
		}
		
		System.out.println("Sucessfully Delete...  ");
	}
	
	public List<Laptop> Dispaly(){
		
		String select="select l from Laptop l";
		Query query= entityManager.createQuery(select);
		
		return query.getResultList();
	}
}
