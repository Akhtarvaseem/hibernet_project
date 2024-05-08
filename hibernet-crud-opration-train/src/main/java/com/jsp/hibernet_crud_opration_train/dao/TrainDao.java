package com.jsp.hibernet_crud_opration_train.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernet_crud_opration_train.dto.Train;

public class TrainDao {
	
	public void trainInsert(Train train) 
	{
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
	
		
		entityTransaction.begin();
		entityManager.persist(train);
		entityTransaction.commit();
		
		System.out.println("Insert successFully .....");
	}
	
	
	
	public void trainUpdate(Train train) 
	{
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
	     
		entityManager.find(Train.class, train.getTrianNo());
		entityTransaction.begin();
		
		entityManager.merge(train);
		entityTransaction.commit();
		
		System.out.println("Update successFully .....");
	   }
	
	
       public void trainDelete(int trianNo) 
       {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
	     
		
		Train train=entityManager.find(Train.class, trianNo);
		entityTransaction.begin();
		entityManager.remove(train);
		entityTransaction.commit();
		System.out.println("Delete successFully .....");
	    }
	
       public List<Train> trainDisplay( ) 
       {
   		
   		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
   		EntityManager entityManager=entityManagerFactory.createEntityManager();
   		
   	    String select= "select s from Train s";
   	    
   	    Query query=entityManager.createQuery(select);
   		
   	    List<Train> list=query.getResultList();
   		
   	     if(list!=null) {
   	    	 return list;
   	     }
   	     else {
   	    	 return null;
   	     }
   		 

   		
   	}
       
       
//    // delete the data with JPQL query with position
//	
//
//        public void deleteJPQL(int id){
//        	
//        	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
//    		EntityManager entityManager=entityManagerFactory.createEntityManager();
//    		EntityTransaction entityTransaction=entityManager.getTransaction();
//    		
//
//    		String delete="Delete  From Train t Where t.trianNo=?123";
//    		entityTransaction.begin();
//    		Query query=entityManager.createQuery(delete);
//    		query.setParameter(123, id);
//    		query.executeUpdate();
//    		entityTransaction.commit();
//
//    		System.out.println("Delete Successfully...");
//        }
       
    // delete the data with JPQL query with nameQuery
	

        public void deleteJPQL(int id){
        	
        	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
    		EntityManager entityManager=entityManagerFactory.createEntityManager();
    		EntityTransaction entityTransaction=entityManager.getTransaction();
    		

    		entityTransaction.begin();
    		Query query=entityManager.createNamedQuery("deleteQuery");
    		query.setParameter("trainNo", id);
    		query.executeUpdate();
    		entityTransaction.commit();

    		System.out.println("Delete Sucessfulluy...");
        }
}
