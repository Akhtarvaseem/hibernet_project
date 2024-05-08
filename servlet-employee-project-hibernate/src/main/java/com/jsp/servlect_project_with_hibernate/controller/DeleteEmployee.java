package com.jsp.servlect_project_with_hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlect_project_with_hibernate.dto.Employee;
import com.jsp.servlect_project_with_hibernate.service.EmployeeService;

@WebServlet("/empsDelete1")
public class DeleteEmployee extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee employee= new Employee();
    	EmployeeService service= new EmployeeService();
    	
        int  id=Integer.parseInt(req.getParameter("id"));
        
        employee.setId(id);
        
        service.deleteEmployee(employee);
        
//	   PrintWriter printWriter=resp.getWriter();
//  		
//  		printWriter.write("<html><body>");	
  		
//  	   if(service.getById(employee)==employee.getId()) {
// 		printWriter.write("<h3 style='color:red'>"+employee.getId()+"has been deleted</h3>");
// 		printWriter.write("</body></html>");
 		
// 		RequestDispatcher dispatcher=req.getRequestDispatcher("deleteData.jsp");
//  	   dispatcher.include(req, resp); 
//	}
//  	   else {
//  		   printWriter.write("<h3 style='color:red'>Plese! Enter valid id...</h3>");
  		   RequestDispatcher dispatcher=req.getRequestDispatcher("displayData.jsp");
    	   dispatcher.include(req, resp);
//  	   }
//  	   printWriter.write("</body></html>");
	}
	
}
