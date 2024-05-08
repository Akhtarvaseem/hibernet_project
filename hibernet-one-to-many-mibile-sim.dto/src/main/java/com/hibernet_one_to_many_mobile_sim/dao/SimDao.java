package com.hibernet_one_to_many_mobile_sim.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernet_one_to_many_mobile_sim.dto.Sim;

public class SimDao {

	
EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("akhtar");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
	
// InsertSim in database
	public void simInsert(List<Sim> sim) 
	{
		entityTransaction.begin();
		
		for (Sim sim2 : sim) {
			
			entityManager.persist(sim2);
		}
		
		entityTransaction.commit();
		System.out.println("Successfully....");
	}
	
// get the all sim details 
	
		public List<Sim> getAllSims(){
			
			String select= "select s from Sim s";
			
			Query query= entityManager.createQuery(select);
			
//			return entityManager.createQuery(select, Sim.class).getResultList();
			 return query.getResultList();	 
		}
		
		
// DleteSim data form database 
		public void deleteSim(int id) {
			
			Sim sim=entityManager.find(Sim.class, id); 
			if(sim!=null){
				entityTransaction.begin();
				entityManager.remove(sim);
				entityTransaction.commit();
				
			}
			System.out.println("Delete SucessFully...");
		}
		
// updateSim Data from database
		
		public void updateSim( Sim sim) {
			
			Sim sim2=entityManager.find(Sim.class, sim.getId());
			
			if(sim2!=null) {
				sim2.setSimName(sim.getSimName());
				sim2.setNetworkType(sim.getNetworkType());
				
				entityTransaction.begin();
				entityManager.merge(sim2);
				entityTransaction.commit();
			}
			System.out.println("SuccessFully Updated .");
		}
}
