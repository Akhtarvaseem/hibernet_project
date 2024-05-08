package com.jsp.servlect_project_with_hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlect_project_with_hibernate.dao.EmployeeDao;
import com.jsp.servlect_project_with_hibernate.dto.Employee;
import com.jsp.servlect_project_with_hibernate.service.EmployeeService;



public class EmployeeController extends HttpServlet{

//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		Employee employee= new Employee();
//		EmployeeService service= new EmployeeService();
//		
//		
////		EmployeeDao dao=new EmployeeDao();
//		 int  id=Integer.parseInt(req.getParameter("id"));
//		String name=req.getParameter("name");
//		String email=req.getParameter("email");
//		String gender=req.getParameter("gender");
//		
//		employee.setId(id);
//		employee.setName(name);
//		employee.setEmail(email);
//		employee.setGender(gender);
//		
//		service.insertEmployee(employee);
//		
////		System.out.println(employee.getId()+" this is id");
//		
//		 System.out.println(id);
//	   System.out.println(name);
//	   System.out.println(email);
//	   System.out.println(gender);
//	   
//	   PrintWriter printWriter=res.getWriter();
//	   
//	   printWriter.write("<html><body>");
////		
//		printWriter.write("<h3 style='color:red'> Success... </h3>");
//		printWriter.write("</body></html>");
//		
//	   RequestDispatcher dispatcher=req.getRequestDispatcher("employee.jsp");
//////	
//	   dispatcher.include(req, res);
////		
//		
//	}
	
	   
	
	

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	Employee employee= new Employee();
    	EmployeeService service= new EmployeeService();
        int  id=Integer.parseInt(req.getParameter("id"));
  		String name=req.getParameter("name");
  		String email=req.getParameter("email");
  		String gender=req.getParameter("gender");
 
  		
  		employee.setId(id);
  		employee.setName(name);
  		employee.setEmail(email);
  		employee.setGender(gender);
  		service.insertEmployee(employee);
  		
  		PrintWriter printWriter=resp.getWriter();
  		
 	   printWriter.write("<html><body>");	
 	   
 		printWriter.write("<h3 style='color:red'> Success... </h3>");
 		printWriter.write("</body></html>");
 		
 	   RequestDispatcher dispatcher=req.getRequestDispatcher("employee.jsp");
 	   dispatcher.include(req, resp);     // it use reload same page
// 	   dispatcher.forward(req, resp);     // it does not reload another page 
    }
    	
}
