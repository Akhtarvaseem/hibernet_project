package servlet_web_app_project_with_restAPI;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Clients_details.dao.ClientsDao;
import com.jsp.Clients_details.dto.Clients;

@WebServlet("/singUpEmployee")
public class controller extends HttpServlet {
	
	
	Clients clients=new Clients();
	ClientsDao dao=new ClientsDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		clients.setId(id);
		clients.setName(name);
		clients.setEmail(email);
		clients.setPass(pass);
		
		dao.insertData(clients);
		
		
	}

}
