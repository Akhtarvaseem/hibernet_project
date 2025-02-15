package com.jsp.hibernet_many_to_many_techer_student_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernet_many_to_many_techer_student_uni.dto.Student;
import com.jsp.hibernet_many_to_many_techer_student_uni.dto.Teacher;

public class StudentTeacherDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
//   Insert StudentTeacher 
	public void studentTeacherInsert(List<Student> students, List<Teacher> teachers) {
		

	    	
		entityTransaction.begin(); 
	    	for (Teacher teacher : teachers) {
	    		if(teacher!=null) {
	    			entityManager.persist(teacher);
	    			for (Student student:students) {
	    				
	    				entityManager.persist(student);
	    			}	
	    			
	    		}
	    		else {
	    			System.out.println("Data not persent ");
	    			
	    		}
	    		
	    	}	
	    	entityTransaction.commit();
		
		System.out.println("Successfully inserted ");
	}
	
// Update TeacherAndStudent 
	public void updateStudentTeacher(int teacherId, int studentId, String teacherName,String studentName) {
		
		Teacher teacher=entityManager.find(Teacher.class, teacherId);
		
		if(teacher!=null) {
			
			entityTransaction.begin();
			teacher.setName(teacherName);
			entityManager.merge(teacher);
			
			List<Student> student=teacher.getStudent();
			
			for (Student student2 : student) {
				if(student2.getsId()==studentId) {
					student2.setName(studentName);
					entityManager.merge(student2);
				}
				else {
					System.out.println(" Student Id not persent ");
				}
			}
		}
		else {
			System.out.println("Teacher id is null ");
		}
		entityTransaction.commit();
		
		System.out.println("Successfully Updated...");
	}
	
// Delete TeacherAndStudent
	
	public void deleteStudentTeacher(int teacherId) 
	{
		   Student teacher=entityManager.find(Student.class, teacherId);
            	
            	entityTransaction.begin();
            	entityManager.remove(teacher);;
            	
            
		       entityTransaction.commit();
		
		System.out.println("Successfully Delete...");
		
	}
	
//Display TeacherAndStudent
	
	public List<Teacher> dispStudentTeacher(){
		
		String select="Select t from Teacher t";
		Query query= entityManager.createQuery(select);
		
		   return query.getResultList();
	}
}
