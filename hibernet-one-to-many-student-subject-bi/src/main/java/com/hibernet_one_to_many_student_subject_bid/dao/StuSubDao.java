package com.hibernet_one_to_many_student_subject_bid.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernet_one_to_many_student_subject_bid.dto.Student;
import com.hibernet_one_to_many_student_subject_bid.dto.Subject;

public class StuSubDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction enetityTransaction=entityManager.getTransaction();
	
	// insert data in database
	public void insertSubStu(Student student, List<Subject> subject) {
		
		enetityTransaction.begin();
		entityManager.persist(student);
		for (Subject subject2 : subject) {
			entityManager.persist(subject2);
		}
		enetityTransaction.commit();
		
		System.out.println("Successfully....");
	}
}
