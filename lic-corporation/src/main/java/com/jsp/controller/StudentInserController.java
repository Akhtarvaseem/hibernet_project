package com.jsp.controller;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.jsp.bean.Student;

public class StudentInserController 
{

	public static void main(String[] args) 
	
	{
		// this is use for persistence- unit  ,it is basically use for connection
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
		
		// This Interface is use for execute or fire our query in side multiply method are present.
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		
		//  This is used for start connection and save data in our database.
		 EntityTransaction entityTransaction= enityManager.getTransaction();
		 
		 Student student=new Student();
		 student.setId(1234);
		 student.setName("akhtar");
		 student.setEmail("akhtar@123gmail.com");
		 
		 
		 entityTransaction.begin();
		 enityManager.persist(student);
		 entityTransaction.commit();
		 
		 System.out.println("Done .....");
		 
		 

	}

}
