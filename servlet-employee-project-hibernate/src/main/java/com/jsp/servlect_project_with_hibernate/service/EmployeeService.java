package com.jsp.servlect_project_with_hibernate.service;

import com.jsp.servlect_project_with_hibernate.dao.EmployeeDao;
import com.jsp.servlect_project_with_hibernate.dto.Employee;

;

public class EmployeeService {

EmployeeDao dao=new EmployeeDao();
//	for insert 
	public void insertEmployee(Employee employee) {
		dao.insertEmployee(employee);
		
	}
	
	// for update 
	public void updateEmployee(Employee employee) {
		 dao.updateEmployee(employee);
		
	}
	
	// for delete
	public int getById(Employee employee) {
		return dao.getById(employee);
	}
	
	
	// this is used for delete data
		public void deleteEmployee(Employee employee) {
			dao.deleteEmployee(employee);
		}
		
		public Employee getEmployeeById(int id) {
			return dao.getEmployeeById(id);
		}
}
