package com.jsp.simple_project_servlet.service;

import com.jsp.simple_project_servlet.dao.EmployeeDao;
import com.jsp.simple_project_servlet.dto.Employee;

public class EmployeeService {

	EmployeeDao dao=new EmployeeDao();
	
	public void insertEmployee(Employee employee) {
		dao.insertEmployee(employee);
	}
	

	
}
