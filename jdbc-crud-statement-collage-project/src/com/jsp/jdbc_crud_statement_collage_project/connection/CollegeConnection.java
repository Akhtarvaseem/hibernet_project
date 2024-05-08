package com.jsp.jdbc_crud_statement_collage_project.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CollegeConnection {
	
    public static Connection getConnection() {
    	Connection conn;
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc-crud-statement-collage-project";
			String user="root";
			String pass="python@123";
			
			conn=DriverManager.getConnection(url,user,pass);
			
			if(conn!=null) {
				return conn;
			}
			else {
				return null;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    	
    	
    }
}
