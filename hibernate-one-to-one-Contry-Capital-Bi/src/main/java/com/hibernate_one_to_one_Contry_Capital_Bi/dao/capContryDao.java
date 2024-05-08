package com.hibernate_one_to_one_Contry_Capital_Bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernate_one_to_one_Contry_Capital_Bi.dto.Capital;
import com.hibernate_one_to_one_Contry_Capital_Bi.dto.Country;
import com.hibernate_one_to_one_Contry_Capital_Bi.service.capCountryService;


// insert capcountry
public class capContryDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
	EntityManager enetityManager=entityManagerFactory.createEntityManager();
	EntityTransaction enetityTransaction=enetityManager.getTransaction();
	public void insertCapCon(Country country, Capital capital) {
		
		enetityTransaction.begin();
//		enetityManager.persist(capital);
		enetityManager.persist(country);
		enetityTransaction.commit();
		System.out.println("Successfully ");
		
	}
	
	
	// update capital and country 
	
	public void  updateCapCountry(int id,String CapName, String countryName) {
		
		Capital capital=enetityManager.find(Capital.class, id);
		
		Country country=capital.getCountry();
		enetityTransaction.begin();
		capital.setName(CapName);
		country.setName(countryName);
		
		enetityManager.merge(capital);
		enetityTransaction.commit();
		
		System.out.println("Successfully update");
		
		
	}
	// delete capital and country 
	
	public void  deleteCapCountry(int id) {
		
		Country country=enetityManager.find(Country.class, id);
//		Capital capital=enetityManager.find(Capital.class, id);
		
		if(country!=null) {
			
			enetityTransaction.begin();
			
			enetityManager.remove(country);
			enetityTransaction.commit();
			
		}
		else {
			System.out.println("Id not found");
		}
		System.out.println("Successfully delete");
		
		
	}
	
    // display the datacapcountry
	
	public List<Capital> DisplyCapCoun(){
		
		String select="select s from Capital s";
		
		Query query=enetityManager.createQuery(select);
		
		return query.getResultList();
	}
}
