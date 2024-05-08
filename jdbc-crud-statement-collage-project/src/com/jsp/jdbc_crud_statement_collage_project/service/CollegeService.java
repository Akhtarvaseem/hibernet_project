package com.jsp.jdbc_crud_statement_collage_project.service;

import java.util.List;

import com.jsp.jdbc_crud_statement_collage_project.dao.CollegeDao;
import com.jsp.jdbc_crud_statement_collage_project.dto.College;

public class CollegeService {
	CollegeDao dao=new CollegeDao();
	public void insertDao(College college) {
		
		dao.insertDao(college);
	}
    
	public void insertAddBatch(List<College> college) {
		dao.insertAddBatch(college);
	}
	
	public void collegeUpdate(College college) {
		int id=dao.getByID(college.getId());
		if(id==college.getId()) {
			
			dao.collegeUpdate(college);
		}
		else {
			System.out.println("You are Enter Wrong id ");
		}
	}
	
	 public void collegeDelete(College college) {
		 dao.collegeDelete(college);
	 }
	 
	 public List<College> collegeDisplay(College college){
		 return dao.collegeDisplay(college);
	 }
}
