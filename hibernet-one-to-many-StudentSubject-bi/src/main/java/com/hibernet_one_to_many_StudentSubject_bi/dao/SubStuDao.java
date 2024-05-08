package com.hibernet_one_to_many_StudentSubject_bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernet_one_to_many_StudentSubject_bi.dto.Student;
import com.hibernet_one_to_many_StudentSubject_bi.dto.Subject;


public class SubStuDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction enetityTransaction=entityManager.getTransaction();

	
	// this method id used for insert data in table
	public void insertSubStu( Student student,List<Subject> subject) {
		enetityTransaction.begin();
		
//		entityManager.persist(student);
		
		for (Subject subject2 : subject) {
			entityManager.persist(subject2);
		}
		enetityTransaction.commit();
		
		System.out.println("Successfully....");
	}
	
	// Update the table data 
	
	public void updateSubStu(int id, String StuName, String SubName) {
		
		Subject subject=entityManager.find(Subject.class, id);
		
		enetityTransaction.begin();
		
		subject.setName(SubName);
	    
		Student student=subject.getStudent();
		student.setName(StuName);
		
		entityManager.merge(subject);
		
		enetityTransaction.commit();
		
		System.out.println("Successfully updated...");
		
	}
	
	// delete the data
	
	public void deleteSubStu(int id) {
		Subject subject=entityManager.find(Subject.class, id);
		
		enetityTransaction.begin();
		
		entityManager.remove(subject);
		
		enetityTransaction.commit();
		
		System.out.println(" SuccessFully delete...");
	}
	
	
	// display data 
	
	public List<Subject> displaySubStu(){
		
		String select ="select s from Subject s";
		
		Query query= entityManager.createQuery(select);
		
		return query.getResultList();
	}
}
