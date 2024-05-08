package com.jsp.spring_core_crud_opration_with_anotation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.sql.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.spring_core_crud_opration_with_anotation.dto.Team;

@Component
public class TeamDao {
    
	@Autowired
	EntityManagerFactory entityManagerFactory;
    public void insertTeam(Team team) {
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	EntityTransaction entityTransaction=entityManager.getTransaction();
    	
    	entityTransaction.begin();
    	entityManager.persist(team);
    	entityTransaction.commit();
    }
    
    // For update 
    public void updateTeam(Team team) {
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	EntityTransaction entityTransaction=entityManager.getTransaction();
    	
    	Team team2=entityManager.find(Team.class,team.getId());
    	
    	if(team2!=null) {
    		entityTransaction.begin();      
    		
    		team2.setName(team.getName());
    		team2.setRank(team.getRank());
    		
    		entityManager.merge(team2);
    		
    	}
    	
    	entityTransaction.commit();
    	
    	System.out.println("Successfully updated");
    }
    
// for delete
    
    public void deleteTeam(Team team) {
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	EntityTransaction entityTransaction=entityManager.getTransaction();
    	
    	Team team2=entityManager.find(Team.class,team.getId());
    	
    	if(team2!=null) {
    		entityTransaction.begin();      
    		
    		entityManager.remove(team2);
    	}
    	
    	entityTransaction.commit();
    	
    	System.out.println("Successfully delete");
    }
    
    
    //for display
    
    public List<Team> display(){
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	EntityTransaction entityTransaction=entityManager.getTransaction();
    	
    	String select= "select e from Team e";
        Query query=entityManager.createQuery(select);
        
        return query.getResultList();
     
    	
    }
    
}
