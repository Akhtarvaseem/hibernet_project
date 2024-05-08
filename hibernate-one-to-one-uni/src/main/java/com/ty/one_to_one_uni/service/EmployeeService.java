package com.ty.one_to_one_uni.service;

import java.util.List;

import com.ty.one_to_one_uni.dao.EmployeeDao;
import com.ty.one_to_one_uni.dto.Employee;
import com.ty.one_to_one_uni.dto.Laptop;

public class EmployeeService {
   EmployeeDao dao=new EmployeeDao();
   
	public void insertDao(Employee employee, Laptop laptop) {
		dao.insertDao(employee, laptop);
	}
	
	public void updateDao(int id, String name, String proceser) {
		dao.updateDao(id, name, proceser);
	}
	
	public void  delteDao(int id) {
		dao.delteDao(id);
	}
	
	public List<Employee> displayDao()
	{
		return dao.displayDao();
	}
}
