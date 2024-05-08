package com.jsp.jdbc_crud_with_statement.service;

import java.util.List;

import com.jsp.jdbc_crud_with_statement.dao.CustmerDao;
import com.jsp.jdbc_crud_with_statement.dto.Custmer;

public class CustmerService {
	
	// these method are use for insert the data in Schema.
	CustmerDao dao=new CustmerDao();
	public void insertCustmer(Custmer custmer) {
		
		dao.insertCustmer(custmer);
		
	}
	
	public void custmerUpdate(String name,int id) {
		
		int id1=dao.getById(id);;
		if(id==id1) {
			dao.custmerUpdate(name, id1);
		}
		else {
			System.out.println("Hey is not "+id+"  your id ");
		}
	}
	
	// this is use for delete successfully
	public void custmerDelete( int id) {
		int id2=dao.getById(id);
		if(id2==id) {
			dao.custmerDelete(id2);
		}
		else {
			System.out.println("Sorry for delete!");
		}
		
	}
	
	// this is for disply the query
	public List<Custmer> custmerDisplay(Custmer custmer){
		
//		List<Custmer> custmer1=dao.custmerDisplay(custmer);
//		return custmer1;
		
//		or 
		
		return dao.custmerDisplay(custmer);
	}
	
	
	

}
