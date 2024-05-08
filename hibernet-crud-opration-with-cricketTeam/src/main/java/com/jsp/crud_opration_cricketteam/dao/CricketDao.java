package com.jsp.crud_opration_cricketteam.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.crud_opration_cricketteam.dto.CricketTeam;

public class CricketDao {
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
     EntityManager entityManager=entityManagerFactory.createEntityManager();
     EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insertDao(CricketTeam cricket) {
		
	  	entityTransaction.begin();
		entityManager.persist(cricket);
		entityTransaction.commit();
		
		System.out.println("Insert successfully....");
	}
	
	public void updateDao(int id, CricketTeam cricket) {
	     
		 CricketTeam team2=entityManager.find(CricketTeam.class,id);
		 
		 if((cricket.getTeamName() !=null) && (cricket.getTeamCaptain()!=null ) && (cricket.getTeamCoach()!=null))
		 {
			 team2.setTeamName(cricket.getTeamName());
			 team2.setTeamCaptain(cricket.getTeamCaptain());
			 team2.setTeamCoach(cricket.getTeamCoach());
			 entityTransaction.begin();
		     entityManager.merge(team2);
			 entityTransaction.commit();
			System.out.println("Update successfully....");
		 }
		 else if(cricket.getTeamName() !=null) {
			 team2.setTeamName(cricket.getTeamName());
			 entityTransaction.begin();
		     entityManager.merge(team2);
			 entityTransaction.commit();
			System.out.println("Update successfully....");
		 }
		 else if(cricket.getTeamCaptain()!=null) {
			 team2.setTeamCaptain(cricket.getTeamCaptain());
			 entityTransaction.begin();
		     entityManager.merge(team2);
			 entityTransaction.commit();
			System.out.println("Update successfully....");
		 }
		 else if(cricket.getTeamCoach()!=null) {
			 team2.setTeamCoach(cricket.getTeamCoach());
			 entityTransaction.begin();
		     entityManager.merge(team2);
			 entityTransaction.commit();
			System.out.println("Update successfully....");
		 }
		 else {
			 System.out.println("Id not found ....");
		 }

	}
	
	public void deleteDao(int teamId) {
		CricketTeam cricket=entityManager.find(CricketTeam.class, teamId)  ;
		
	  	entityTransaction.begin();
		entityManager.remove(cricket);
		entityTransaction.commit();
		
		System.out.println("delete successfully....");
	}
	
	public List<CricketTeam> dispalyDao()
	{
		 String select="select c from CricketTeam c";
		  Query query= entityManager.createQuery(select);
	      return query.getResultList();
		
	}
}
