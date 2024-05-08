package com.jsp.my_student_dashBoard.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/mylogin")
public class MyLoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 HttpSession httpSession=req.getSession();
		    
		    String user=req.getParameter("UserName");
		    String pass=req.getParameter("UserPass");
		    
		    if((user.equalsIgnoreCase("raj")) && (pass.equalsIgnoreCase("raj@123"))) {
		    	
		    	httpSession.setAttribute("user_name", user);
		   
		    	RequestDispatcher requestDispatcher=req.getRequestDispatcher("MyhomePage.jsp");
		    	
		    	requestDispatcher.forward(req, resp);
		    }
		    else {
		    	
		    	PrintWriter printWriter = resp.getWriter();
		  		printWriter.write("<html><body><h3 style='color:red'>Plese Enter Correct User/Password!</h3></body></html>");
		  		
		  		RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
		  		dispatcher.include(req, resp);	    	
		    }
	}
}
