
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

@WebServlet("/logOut")
public class LogOutController extends HttpServlet{
	

      @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
        HttpSession httpSession = req.getSession();
  		
  		httpSession.invalidate();
  		
  		PrintWriter printWriter = resp.getWriter();
  		printWriter.write("<html><body><h3> alert(You have been logout Please login again) </h3></body></html>");
  		
  		RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
  		dispatcher.include(req, resp);
      }
}

