package com.jsp.preparedstatement_football.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FootbalConnection {
	
        public static Connection getConnection() {
        	Connection conn;
        	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/jdbc-crud-preparedstatemnt-football";
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
