package com.jsp.jdbc_crud_callback_statement.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.jsp.jdbc_crud_statement_collage_project.connection.CollegeConnection;

public class StudentController {

	public static void main(String[] args) {
		Connection conn=CollegeConnection.getConnection();
		try {
			
			CallableStatement statement=conn.prepareCall("call insertStudent(?,?,?)");
			
			statement.setInt(1, 103);
			statement.setString(2,"arbaj");
			statement.setLong(3,912078899);
			
			statement.execute();
			
			System.out.println("Successfully inserted...");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
