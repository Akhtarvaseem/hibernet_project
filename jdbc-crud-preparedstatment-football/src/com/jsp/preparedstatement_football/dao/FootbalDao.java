package com.jsp.preparedstatement_football.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.preparedstatement_football.connection.FootbalConnection;
import com.jsp.preparedstatement_football.dto.Footbal;

public class FootbalDao {
	
	Connection conn=null;
	
	  public void footBallInsert(Footbal footbal) 
	  {
		  conn=FootbalConnection.getConnection();
		  String insert="insert into football values(?,?,?)";
		  
		  try {
			PreparedStatement preparedstatement=conn.prepareStatement(insert);
			
			preparedstatement.setInt(1, footbal.getPlayerId());
			preparedstatement.setString(2, footbal.getPlayerName());
			preparedstatement.setInt(3, footbal.getPlayerGoal());
			
			preparedstatement.execute();
			
			System.out.println("Data insert SuccessFully.....");
		} catch (SQLException e) 
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  finally {
			  try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		    
		  
	  }
	  
	   // //  Add batch
	  public void InsertAddBatch(List<Footbal> footbal) 
	  {
		  conn=FootbalConnection.getConnection();
		  String insert="insert into football values(?,?,?)";
		  
		  try {
			PreparedStatement preparedstatement=conn.prepareStatement(insert);
			 
			for (Footbal footbal2 : footbal) {
				
				preparedstatement.setInt(1, footbal2.getPlayerId());
				preparedstatement.setString(2, footbal2.getPlayerName());
				preparedstatement.setInt(3, footbal2.getPlayerGoal());
				
				preparedstatement.addBatch();
			}
			
//			preparedstatement.execute();
			preparedstatement.executeBatch();
			
			System.out.println("Data insert SuccessFully.....");
		} catch (SQLException e) 
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  finally {
			  try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		    
		  
	  }
//	   This method use for update the data 
	  
	  public void Update(int id, String name, int goal) {
		  conn=FootbalConnection.getConnection();
		  String update="update football set name=?,goal=? where id=?";
		  
		  try {
			PreparedStatement preparedStatement=conn.prepareStatement(update);
			
			 preparedStatement.setInt(3, id);
			 preparedStatement.setString(1, name);
			 preparedStatement.setInt(2, goal);
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("Update SuccessFully.......");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  }
	  
	  //This method for use the delete data
	  
	      public void deleteData(int id) {
		  conn=FootbalConnection.getConnection();
		  String delete="delete from football  where id=?";
		 
		  try {
			PreparedStatement preparedStatement=conn.prepareStatement(delete);
			
			 preparedStatement.setInt(1, id);
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("Delete SuccessFully.......");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  }
	      
	  public List<Footbal> dispFootbal(){
		  
		  conn=FootbalConnection.getConnection();
		  
		  String select="select * from football";
		  
		  try
		  {
			PreparedStatement preparedStatement=conn.prepareStatement(select);
			  ResultSet resultset= preparedStatement.executeQuery();
			  List<Footbal> list= new ArrayList<Footbal>();
			  while(resultset.next()) 
			  {
				  Footbal football=new Footbal();
				  football.setPlayerId(resultset.getInt(1));
				  football.setPlayerName(resultset.getString(2));
				  football.setPlayerGoal(resultset.getInt(3));
				  list.add(football);  
			  }
			 
			  return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		  
	  }

}
