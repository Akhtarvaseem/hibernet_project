package com.jsp.servlect_project_with_hibernate.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlect_project_with_hibernate.dto.Employee;
import com.jsp.servlect_project_with_hibernate.service.EmployeeService;

@WebServlet("/empUpdates1")
public class UpdateEmployeeWithQuery extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee employee= new Employee();
    	EmployeeService service= new EmployeeService();
    	
        int  id=Integer.parseInt(req.getParameter("id"));
        
         Employee employee2=service.getEmployeeById(id);
//         System.out.println(employee2.getName());
         if(employee2!=null) {
        	 req.setAttribute("emp", employee2);
        	 
        	 RequestDispatcher dispatcher=req.getRequestDispatcher("updateEmployeeQueryString.jsp");
        	 dispatcher.forward(req, resp);
         }
	}

}
