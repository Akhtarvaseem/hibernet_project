package com.hibernet_many_to_many_custmor_product_bi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hibernet_many_to_many_custmor_product_bi.dto.Custmor;
import com.hibernet_many_to_many_custmor_product_bi.dto.Product;
import com.hibernet_many_to_many_custmor_product_bi.service.ProductCustmorService;

public class ProductCustmor {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ProductCustmorService service= new ProductCustmorService();
		Custmor custmer= null;
		Product product=null;
		
		while(true) {
			
			System.out.println("1.isert \n2.Update \n3. detele \n4.display");
			
			System.out.println(" Enter your choice");
			
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:{
				List<Custmor> cust= new  ArrayList<Custmor>();
				List<Product> pro= new  ArrayList<Product>();
				
				System.out.println("How data you want to add");
				int size=sc.nextInt();
			    
				for(int i=0; i<size;i++) {
					custmer=new Custmor();
					product= new Product();
					
					System.out.println("Enter Custmer Id ");
					custmer.setId(sc.nextInt());
					
					System.out.println("Enter Custmer Name ");
					custmer.setName(sc.next());
					
					System.out.println("Enter Custmer Address ");
					custmer.setAddress(sc.next());
					
					System.out.println("Enter Custmer Phone Number ");
					custmer.setPhNum(sc.nextLong());
					
					System.out.println(".... Product Detals ....");
					
					System.out.println("Enter product id");
					product.setId(sc.nextInt());
					
					System.out.println("Enter product Name");
					product.setName(sc.next());
					
					System.out.println("Enter product Price");
					product.setPrice(sc.nextDouble());
					
					cust.add(custmer);
					pro.add(product);
					
					product.setCustmer(cust);
//					custmer.setProduct(pro);
				}
				
				
				service.proCusInsert(cust, pro);
				  
			}
			break;
			case 2:{
				
				List<Custmor> cust= new  ArrayList<Custmor>();
				List<Product> pro= new  ArrayList<Product>();
				
				System.out.println("How data you want to update");
				int size=sc.nextInt();
			    
				for(int i=0; i<size;i++) {
					custmer=new Custmor();
					product= new Product();
					
					
					System.out.println("Enter Custmer Id ");
					custmer.setId(sc.nextInt());
					
					System.out.println("Enter Custmer Name ");
					custmer.setName(sc.next());
					
					System.out.println(".... Product Detals ....");
					
					System.out.println("Enter product id");
					product.setId(sc.nextInt());
					
					System.out.println("Enter product Name");
					product.setName(sc.next());
					
					System.out.println("Enter product Price");
					product.setPrice(sc.nextDouble());
					
					cust.add(custmer);
					pro.add(product);
					
					product.setCustmer(cust);
//					custmer.setProduct(pro);
				}
				service.updateProCus(pro);
			}
			break;
			case 3:{
				List<Product> pro= new  ArrayList<Product>();
				
				System.out.println("How data you want to delete");
				int size=sc.nextInt();
			    
				for(int i=0; i<size;i++) {
					product= new Product();
			
					System.out.println(".... Product Detals ....");
					
					System.out.println("Enter product id");
					product.setId(sc.nextInt());
					pro.add(product);
					
				}
				
				service.deleteProCus(pro);
			}
			break;
			case 4:{
				
				List<Product> list=service.displyProCus();
				for (Product product2 : list) {
					
					System.out.println(product2);
					System.out.println(product2.getCustmer());
				}
				
			}
			break;
			}
		}

	}

}
