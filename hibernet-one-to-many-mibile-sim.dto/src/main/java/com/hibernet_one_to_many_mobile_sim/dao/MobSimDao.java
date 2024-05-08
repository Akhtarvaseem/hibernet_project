package com.hibernet_one_to_many_mobile_sim.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernet_one_to_many_mobile_sim.dto.Mobile;
import com.hibernet_one_to_many_mobile_sim.dto.Sim;

public class MobSimDao {
	 
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("akhtar");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
	

	
// InsertSimMobile in database
	public void simMobileInsert(List<Sim> sim, Mobile mobile) 
	{
		entityTransaction.begin();
		for (Sim sim2 : sim) {
			
			entityManager.persist(sim2);
		}
		
		entityManager.persist(mobile);
		entityTransaction.commit();
		System.out.println("Successfully....");
	}
	
	
// get the all sim details 
	
	public List<Sim> getAllSims(){
		
		String select= "select s from Sim s";
		
		Query query= entityManager.createQuery(select);
		
//		return entityManager.createQuery(select, Sim.class).getResultList();
		 return query.getResultList();
		
		 
	}
	
// updateSim Data from database

	
// update mobileSim 
	 
	public void updateMobSim(Mobile mobile ,List<Sim> sim) {
		
		Mobile mobile2=entityManager.find(Mobile.class, mobile.getId());
		
		
		System.out.println(sim+"............");
		if( mobile2!=null) 
		{
			
			mobile2.setMobileBrand(mobile.getMobileBrand());
			mobile2.setMobilePrice(mobile.getMobilePrice());
			entityTransaction.begin();
			entityManager.merge(mobile2);
		    
			for (Sim sim2 : sim) {
				
				Sim sim3= entityManager.find(Sim.class, sim2.getId());
				if(sim3!=null) {
					sim3.setSimName(sim2.getSimName());
					sim3.setNetworkType(sim2.getNetworkType());
					entityManager.merge(sim3);
				}
			}
			entityTransaction.commit();
		}
		
		System.out.println("Successfully update.. MobileSim  ");
	}

// Update mobileSim not all  
	public void updateMobile(int mobileId, int simId, String mobileBrand, String SimType) {
		
		Mobile mobile=entityManager.find(Mobile.class, mobileId);
		
		if(mobile!=null) 
		{
			
			List<Sim> sim=mobile.getSim();
			entityTransaction.begin();
			
			for (Sim sim2 : sim) 
			{
					
					if(sim2.getId()==simId)
					{
						sim2.setNetworkType(SimType);
						entityManager.merge(sim2);
					}
					else 
					{
						System.out.println("Something is Worng..."+sim2.getId());
					}
				}
			
			mobile.setMobileBrand(mobileBrand);
			entityManager.merge(mobile);
			entityTransaction.commit();
		}
		else 
		{
			System.out.println("Mobile Id not found ..");
		}
		
	}
	
//delete mobileSim data 
        public void deleteMobileSim(int mId) {
		
	    Mobile mobile=entityManager.find(Mobile.class, mId);
	
		List<Sim> sim=mobile.getSim();
		System.out.println(sim);
		if(mobile!=null){
			entityTransaction.begin();
			
			entityManager.remove(mobile);
			for(Sim  sim1 : sim) {
				
				entityManager.remove(sim1);
			}
			entityTransaction.commit();
			
		}
		System.out.println("Delete SucessFully...");
	}
        
// Display all data form database ...
        
        public List<Mobile> displayMobSim(){
        	
        	String select="select s from Mobile s";
        	Query query =entityManager.createQuery(select);
        	List<Mobile> list=query.getResultList();     
        	if(list!=null) {
        		return list;
        	}
        	else {
        		return null;
        	}
        	
        	
        }
        

}
