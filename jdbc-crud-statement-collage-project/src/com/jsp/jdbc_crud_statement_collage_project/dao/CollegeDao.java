package com.jsp.jdbc_crud_statement_collage_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.jdbc_crud_statement_collage_project.connection.CollegeConnection;
import com.jsp.jdbc_crud_statement_collage_project.dto.College;

public class CollegeDao {
	Connection conn=null;
	public void insertDao(College college) {
		
		conn=CollegeConnection.getConnection();
		
		String insert="insert into collage values(?,?,?,?)";
		
		try {
			PreparedStatement preStatement=conn.prepareStatement(insert);
			preStatement.setInt(1, college.getId());
			preStatement.setString(2, college.getName());
			preStatement.setString(3, college.getLocation());
			preStatement.setInt(4, college.getDepartment());
			
			preStatement.execute();
			
			System.out.println("Done....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	  public void insertAddBatch(List<College> college) 
	  {
		conn=CollegeConnection.getConnection();
		String insert="insert into collage values(?,?,?,?)";
		try {
			PreparedStatement preStatement=conn.prepareStatement(insert);
			for (College college2 : college) {
				
				preStatement.setInt(1, college2.getId());
				preStatement.setString(2, college2.getName());
				preStatement.setString(3, college2.getLocation());
				preStatement.setInt(4, college2.getDepartment());
				preStatement.addBatch();
			}
			preStatement.executeBatch();
			
			System.out.println("Data add Successfully");
		} catch (SQLException e) 
		   {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	}
	  
	  
	  // // This method use for update the data for table  
	  public void collegeUpdate(College college) 
	  {
		  conn=CollegeConnection.getConnection();
			String update="update collage set name=?,location=? where id=?";
			try {
				PreparedStatement preStatement=conn.prepareStatement(update);
				preStatement.setInt(3, college.getId());
				preStatement.setString(1, college.getName());
				preStatement.setString(2, college.getLocation());
				
				preStatement.executeUpdate();
				
				System.out.println("Data Updated...............");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	  }
	  
	  
	  // // This is use for delete the data from table
	  public void collegeDelete(College college) 
	  {
		  conn=CollegeConnection.getConnection();
			String delete="delete from collage  where id=?";
			try {
				PreparedStatement preStatement=conn.prepareStatement(delete);
				preStatement.setInt(1, college.getId());
				preStatement.executeUpdate();
				
				System.out.println("Data Deleted...............");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	  }
	  
	  // This method is user for Validation check
	  public int getByID(int id) {
		  conn=CollegeConnection.getConnection();
		  String select="select * from collage where id=?";
		  
		  try {
			PreparedStatement preStatement=conn.prepareStatement(select);
			preStatement.setInt(1, id);
			ResultSet resultset=preStatement.executeQuery();
			
			while(resultset.next()) {
				int id1=resultset.getInt("id");
				return id1;
			};
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		  
	  }
	  
	  // // This method is use for display 
	  
	  public List<College> collegeDisplay(College college) {
		  conn=CollegeConnection.getConnection();
		  String select="select * from collage";
		  
		  try {
			PreparedStatement preStatement=conn.prepareStatement(select);
			
			ResultSet resultset=preStatement.executeQuery();
			
			List<College> list=new ArrayList<College>();
			while(resultset.next()) {
				College college1=new College();
				college1.setId(resultset.getInt(1));
				college1.setName(resultset.getString(2));
				college1.setLocation(resultset.getString(3));
				college1.setDepartment(resultset.getInt(4));
				list.add(college1);
			};
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		  
	  }
}
