package com.jsp.jdbc_crud_with_statement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.jdbc_crud_with_statement.dto.Custmer;

public class CustmerDao {
	
	Connection conn;
	
	// insert method
	public void insertCustmer(Custmer custmer) 
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");    /// its fully name of driver class
			
			String url="jdbc:mysql://localhost:3306/jdbc-crud-with-statement";
			String user="root";
			String pass="python@123";
			
			conn=DriverManager.getConnection(url,user,pass);
			
			Statement statement=conn.createStatement();
			
			String insert="insert into custmer values("+custmer.getCustmerId()+",'"+custmer.getCustmerName()+"','"+custmer.getCustmerEmail()+"')";
			statement.execute(insert);
			System.out.println("Done.....");
			
			System.out.println("\n ");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally 
		{
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public int getById(int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");    /// its fully name of driver class
			
			String url="jdbc:mysql://localhost:3306/jdbc-crud-with-statement";
			String user="root";
			String pass="python@123";
			
			conn=DriverManager.getConnection(url,user,pass);
			
			Statement statement=conn.createStatement();
			
			String insert="select * from custmer where id="+id+" ";
			
			ResultSet resultSet=statement.executeQuery(insert);
			
			resultSet.next();
			
			int id1=resultSet.getInt("id");
			
			return id1;                  /// if execute then return id1 to the getByID 
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally 
		{
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return 0;                   // If first return not execute then execute this 
		
	}
	
// for update the query ....
	public void custmerUpdate(String name, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");    /// its fully name of driver class
			
			String url="jdbc:mysql://localhost:3306/jdbc-crud-with-statement";
			String user="root";
			String pass="python@123";
			
			conn=DriverManager.getConnection(url,user,pass);
			
			Statement statement=conn.createStatement();
			
			String update= "update custmer set name='"+name+"' where id="+id+" ";
			
			statement.executeUpdate(update);
			
			System.out.println("Done.....");
			
			System.out.println("\n ");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally 
		{
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
// // this is use for delete
	
	
	public void custmerDelete( int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");    /// its fully name of driver class
			
			String url="jdbc:mysql://localhost:3306/jdbc-crud-with-statement";
			String user="root";
			String pass="python@123";
			
			conn=DriverManager.getConnection(url,user,pass);
			
			Statement statement=conn.createStatement();
			
			String delete= "delete from custmer where id="+id+" ";
			
			statement.executeUpdate(delete);
			System.out.println("Successfully Deleted!......");
			
			System.out.println("\n ");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally 
		{
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
// // for display 
	
	public List<Custmer> custmerDisplay(Custmer custmer) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc-crud-with-statement";
			String user="root";
			String pass="python@123";
			
			conn=DriverManager.getConnection(url,user,pass);
			
			Statement statement=conn.createStatement();
			String dispCustmer="select * from custmer";
			
			ResultSet resultSet=statement.executeQuery(dispCustmer);
			
			List<Custmer> custmers=new ArrayList<Custmer>();	
			while(resultSet.next()) {
			 Custmer custmer1=new Custmer();
			 
			 int id=resultSet.getInt("id");
			 String name=resultSet.getString("name");
			 String email=resultSet.getString("email");
			 
			 custmer1.setCustmerId(id);
			 custmer1.setCustmerName(name);
			 custmer1.setCustmerEmail(email);
			 
			 
			 custmers.add(custmer1);
			 
			};
			
			return custmers;
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}
}
