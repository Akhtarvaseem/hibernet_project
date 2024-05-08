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


@WebServlet("/myProfile")
public class ProfileController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      HttpSession httpSession=req.getSession();
			
			if(httpSession.getAttribute("user_name")!=null) {
				
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("MyProfile.jsp");
				requestDispatcher.include(req, resp);
			}
			else {
				
				PrintWriter printWriter = resp.getWriter();
				printWriter.write("<html><body><h3>You have been logout Please login again</h3></body></html>");
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("Login.jsp");
				requestDispatcher.include(req, resp);
			}
	}
}

