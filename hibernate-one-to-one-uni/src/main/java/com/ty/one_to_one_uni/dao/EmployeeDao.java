package com.ty.one_to_one_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.one_to_one_uni.dto.Employee;
import com.ty.one_to_one_uni.dto.Laptop;

public class EmployeeDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
    
    /*
     * This is use for insert data in Employee and Laptop
     */
	public void insertDao(Employee employee, Laptop laptop) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityManager.persist(laptop);
		entityTransaction.commit();
		System.out.println("Data Enter Successfully....");
	}

	 
	// update the details of project
	public void updateDao(int id, String employeeName, String laptopProceser) {
		
		 Employee employee= entityManager.find(Employee.class, id)   ;
		
		 Laptop laptop= employee.getLaptop();
		 
		 if(employee!=null) {
			 laptop.setProceser(laptopProceser);
			 employee.setName(employeeName);
			 
			 entityTransaction.begin();
			 entityManager.merge(employee);
			 entityManager.merge(laptop);
			 entityTransaction.commit();
		 }
		 System.out.println("Successfully Updated...");
		 
	}
	
	// delete the data form project 
	public void  delteDao(int id) {
		
		 Employee employee= entityManager.find(Employee.class, id)   ;
		
		 Laptop laptop= employee.getLaptop();
		 
		 if(employee!=null) {
			 
			 entityTransaction.begin();
			 if(laptop!=null) {
				 
				 entityManager.remove(laptop);
			 }
			 entityManager.remove(employee);
			
			 entityTransaction.commit();
		 }
		 System.out.println("Successfully delete...");
		 
	}
	
	public List<Employee> displayDao(){
		
		  String select="select e from Employee e";
		  Query query= entityManager.createQuery(select);
		  
		  List<Employee> list= query.getResultList();
		  
		  if(list!=null) {
			  return list;
		  }
		  else {
			  return null;
		  }
		  
	}
	
}
