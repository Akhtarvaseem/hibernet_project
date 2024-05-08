package com.jsp.simple_project_servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.simple_project_servlet.dto.Employee;
import com.jsp.simple_project_servlet.service.EmployeeService;

public class EmployeeController extends HttpServlet {

	Employee employee=new Employee();
	EmployeeService service=new EmployeeService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		
		employee.setId(id);
		employee.setName(name);
		employee.setEmail(email);
		employee.setGender(gender);
		
		PrintWriter printWriter=resp.getWriter();
		
		printWriter.write("<html><body>");
		service.insertEmployee(employee);
		
		printWriter.write("<h3 style='color:green'>Success...</h3>");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("index.jsp");
		
		dispatcher.include(req, resp);
	}
}
