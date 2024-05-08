package com.jsp.jdbc_crud_opration_statement.service;

import java.util.List;

import com.jsp.jdbc_crud_opration_statement.dao.TeacherDao;
import com.jsp.jdbc_crud_opration_statement.dto.Teacher;

public class TeacherService {
	TeacherDao dao=new TeacherDao();
	public void insertData(Teacher teacher) {
		
		dao.insertData(teacher);
		
	}
	
	public void updateData(Teacher teacher) {
		dao.updateData(teacher);
	}
	
	public void deleteData(Teacher teacher) {
	dao.deleteData(teacher);	
	}
	
	public List<Teacher> displayData( ) {
		List<Teacher> teachers=   dao.displayData( );
		return teachers;
		  
	}
	

}
