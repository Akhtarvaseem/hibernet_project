package com.jsp.simple_project_servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AddTwoNumber implements Servlet  {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		PrintWriter printWriter=res.getWriter();
		
		printWriter.write("<html><body>");
		
		int num1=Integer.parseInt(req.getParameter("number1"));
		int num2=Integer.parseInt(req.getParameter("number2"));
		
		printWriter.write("<p>addition of "+num1+" and "+ num2+"="+ (num1+num2)+"</p>");
		printWriter.write("</body></html>");
		
		System.out.println("Server is  response...");
		printWriter.write("<h3 style='color:green'>Success...</h3>");
       RequestDispatcher dispatcher=req.getRequestDispatcher("index.jsp");
		
		dispatcher.include(req, res);
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	

}
