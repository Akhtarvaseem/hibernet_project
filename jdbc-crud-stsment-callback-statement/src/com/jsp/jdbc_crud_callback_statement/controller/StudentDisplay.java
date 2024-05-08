package com.jsp.jdbc_crud_callback_statement.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.jdbc_crud_statement_collage_project.connection.CollegeConnection;

public class StudentDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        
		 Connection conn  =   CollegeConnection.getConnection();
		 
		  try {
			CallableStatement clallableStatement  = conn.prepareCall("call  studentDisplay()");
			ResultSet statement= clallableStatement.executeQuery();
			
		    while(statement.next()) {
		    	
		    	int id=statement.getInt(1);
		    	String name=statement.getString(2);
		    	Long phone=statement.getLong(3);
		    	
		    	
		    	System.out.println(id);
		    	System.out.println(name);
		    	System.out.println(phone);
		    	
		    	System.out.println("----------------");
		    }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
