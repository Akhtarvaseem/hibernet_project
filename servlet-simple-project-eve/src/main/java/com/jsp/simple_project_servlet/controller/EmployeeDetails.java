
package com.jsp.simple_project_servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmployeeDetails extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {


		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		
		PrintWriter printWriter=res.getWriter();
		
		printWriter.write("<html><body><table>");
		printWriter.write("<tr><th>EmpId</th><th>EmpName</th><th>EmpEmail</th><th>EmpGender</th></tr>");
		printWriter.write("<tr><td>"+id+"</td><td>"+name+"</td><td>"+email+"</td><td>"+gender+"</td>");
		
		printWriter.write("</table></body></html>");
		
	}

}
