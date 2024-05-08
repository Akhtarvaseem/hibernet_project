package com.jsp.servlect_project_with_hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.servlect_project_with_hibernate.dto.Employee;


public class EmployeeDao{

	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entiyTransaction=entityManager.getTransaction();
	
//  this is used for insert data 
	public void insertEmployee(Employee employee) {
		entiyTransaction.begin();
		entityManager.persist(employee);
		entiyTransaction.commit();
		
		System.out.println("Sucessfully Inserted ");
	}
// this is used for update data
	public void updateEmployee(Employee employee) {
		entiyTransaction.begin();
		Employee employee2=entityManager.find(Employee.class, employee.getId());
		if(employee2!=null) {
			employee2.setName(employee.getName());
			employee2.setEmail(employee.getEmail());
			
			entityManager.merge(employee2);
			entiyTransaction.commit();
		}
		System.out.println("Sucessfully Updated... ");
	}
	
// this is used for delete data
	public void deleteEmployee(Employee employee) {
		entiyTransaction.begin();
		Employee employee2=entityManager.find(Employee.class, employee.getId());
		if(employee2!=null) {
			entityManager.remove(employee2);
			entiyTransaction.commit();
			System.out.println("Sucessfully Updated... ");
		}
		else {
			System.out.println(" plese Enter valid id ");
		}
	}
	

// This is ues to display all data in document or web page
	public List<Employee> displayEmployee(){
		
		String select="select e from Employee e";
		Query query=entityManager.createQuery(select);
		return query.getResultList();
	}
	
	
	public int getById(Employee employee) {
	
		Employee employee2=entityManager.find(Employee.class,  employee.getId());
		
		if(employee2!=null) {
			return employee2.getId();
		}
		return 0;
	}
	
	
	public Employee getEmployeeById(int id) {
		
		Employee employee2=entityManager.find(Employee.class,  id);
		
		if(employee2!=null) {
			
			return employee2;
		}
		return null;
	}
	
	

	
	
}
