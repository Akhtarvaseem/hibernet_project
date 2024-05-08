package com.jsp.jdbc_crud_opration_statement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.jdbc_crud_opration_statement.dto.Teacher;

public class TeacherDao {
	
	Connection conn;
	public void insertData(Teacher teacher) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/jdbc-crud-statement-assignment";
			String user="root";
			String pass="Y1012Jqkhkp";
			
		    conn=DriverManager.getConnection(url,user,pass); 
		    Statement statement=conn.createStatement();
		    String insert="Insert into teacher values("+teacher.getId()+",'"+teacher.getName()+"','"+teacher.getEmail()+"',"+teacher.getPhone()+")";
			  boolean bb= statement.execute(insert);
			
			if(bb!=true) {
				
				System.out.println("Insert succesfully.....");
			}
			else {
				System.out.println(" data not inserted ");
			}
		    
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// update query
public void updateData(Teacher teacher) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/jdbc-crud-statement-assignment";
			String user="root";
			String pass="Y1012Jqkhkp";
			
		    conn=DriverManager.getConnection(url,user,pass); 
		    Statement statement=conn.createStatement();
		    String update="update teacher set name='"+teacher.getName()+"' where id="+teacher.getId()+" ";
			int upd= statement.executeUpdate(update);
			
			if(upd!=0) {
				
				System.out.println("Update succesfully.....");
			}
			else {
				System.out.println(" Sorry! plese cheack your connection ..... ");
			}
		    
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	// delete query

public void deleteData(Teacher teacher) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/jdbc-crud-statement-assignment";
		String user="root";
		String pass="Y1012Jqkhkp";
		
	    conn=DriverManager.getConnection(url,user,pass); 
	    Statement statement=conn.createStatement();
	    String delete="delete from teacher where id="+teacher.getId()+" ";
		int upd= statement.executeUpdate(delete);
		
		if(upd!=0) {
			
			System.out.println("Update Succesfully.....");
		}
		else {
			System.out.println(" Plese cheack your connection .... ");
		}
	    
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

	
	
	//display query

public List<Teacher> displayData( ) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/jdbc-crud-statement-assignment";
		String user="root";
		String pass="Y1012Jqkhkp";
		
	    conn=DriverManager.getConnection(url,user,pass); 
	    Statement statement=conn.createStatement();
	    String display="select * from teacher";
		ResultSet resultset= statement.executeQuery(display);
		
		List<Teacher> teachers=new ArrayList<Teacher>();
		
		while(resultset.next()) 
		{
			
			  Teacher teacher=new Teacher();
			  teacher.setId(resultset.getInt("id"));
			  teacher.setName(resultset.getString("name"));
			  teacher.setEmail(resultset.getString("email"));
			  teacher.setPhone(resultset.getLong("phone"));
			  
			  teachers.add(teacher);
		}
	    
		return teachers;
	} catch (ClassNotFoundException | SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally 
	{
		try 
		{
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return null;
}
   

}
