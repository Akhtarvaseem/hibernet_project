package com.jsp.jdbc_crud_with_statement.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.jsp.jdbc_crud_with_statement.dto.Custmer;
import com.jsp.jdbc_crud_with_statement.service.CustmerService;

public class WriteInFile {

	public static void main(String[] args)
	{
	
		Custmer custmer=new Custmer();
		CustmerService custmerservice= new CustmerService();
		List<Custmer> custmer2=custmerservice.custmerDisplay(custmer);
		
		try {
			FileWriter f=new FileWriter("C:\\Users\\IMTEYAZ\\Desktop\\demo.txt");
			try {
				
				   int count=0;
				   f.write("S.No." +"custmerID"+ "   " +" CustmerName"+"  "+" custmerEmail \n");
				     for (Custmer custmer3 : custmer2) {
					if(custmer3.getCustmerId()>10001) {
						
						f.write(count++ +" \t "+custmer3.getCustmerId()+ " \t " + custmer3.getCustmerName()+ "\t"+custmer3.getCustmerEmail()+" \n" );
					}
					else {
						System.out.println(" data not write");
					}
					
				}
				
			} 
			finally{
			  f.close();
			}
			
			System.out.println(" successfully write in file ...");
		}
		catch (IOException e) {
		
			System.out.println(e);
		}
		
	}

}
