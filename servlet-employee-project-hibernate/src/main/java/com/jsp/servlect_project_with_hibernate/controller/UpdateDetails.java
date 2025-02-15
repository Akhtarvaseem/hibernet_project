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

@WebServlet("/empUpdates")
public class UpdateDetails extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Employee employee= new Employee();
    	EmployeeService service= new EmployeeService();
    	
        int  id=Integer.parseInt(req.getParameter("id"));
  		String name=req.getParameter("name");
  		String email=req.getParameter("email");

  		
  		
  		employee.setId(id);
  		employee.setName(name);
  		employee.setEmail(email);
  	    
  		service.updateEmployee(employee);
  		
  		PrintWriter printWriter=resp.getWriter();
  		
  		printWriter.write("<html><body>");	
  		
  	   if(service.getById(employee)!=0) {
  		   
  	   
 		printWriter.write("<h3 style='color:red'>"+employee.getId()+"    "+employee.getName()+"  "+employee.getEmail()+"   has been updated</h3>");
 		printWriter.write("</body></html>");
 		printWriter.write("<h3>If you want to update multiple then enter Id  </h3>");
 		
 		RequestDispatcher dispatcher=req.getRequestDispatcher("updateEmployee.jsp");
  	   dispatcher.include(req, resp); 
	}
  	   else {
  		   printWriter.write("<h3 style='color:red'>Plese! Enter valid id...</h3>");
  		   RequestDispatcher dispatcher=req.getRequestDispatcher("updateEmployee.jsp");
    	   dispatcher.forward(req, resp);
  	   }
  	   printWriter.write("</body></html>");
	}
}
