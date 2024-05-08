package com.hibernet_many_to_many_custmor_product_bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernet_many_to_many_custmor_product_bi.dto.Custmor;
import com.hibernet_many_to_many_custmor_product_bi.dto.Product;

public class ProductCustmorDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	// This method is used for insertCustmerAndProduct
	public void proCusInsert(List<Custmor> custmor, List<Product> product) {
		entityTransaction.begin();
		for (Product product3 : product) {
			
			entityManager.persist(product3);
		}
		
//		for (Custmor custmor1 : custmor) {
//			
//			entityManager.persist(custmor1);
//			
//		}
		
		entityTransaction.commit();
		System.out.println(" Successfully inserted...");
	}
	
	// This method is used for UpdateCustmerAndProduct
	public void updateProCus(List<Product> product) {
		entityTransaction.begin();
		for (Product product3 : product) {
			Product product1= entityManager.find(Product.class,product3.getId());
			
			List<Custmor> custmer=product3.getCustmer();
			
			if(product1.getId()==product3.getId()) {
				product1.setName(product3.getName());
				product1.setPrice(product3.getPrice());
				
				for (Custmor custmer1: custmer) {
					Custmor custmer2= entityManager.find(Custmor.class,custmer1.getId());
					
					if(custmer2.getId()==custmer1.getId()) {
						custmer2.setName(custmer1.getName());
						
						entityManager.merge(product1);
					}
				}
				
			}
		}

		entityTransaction.commit();
		System.out.println(" Successfully updated...");
	}
	
	// This method is used for deleteCustmerAndProduct
	public void deleteProCus(List<Product> product) {
		entityTransaction.begin();
		
		for (Product product3 : product) {
			Product product1= entityManager.find(Product.class,product3.getId());
			
			if(product1.getId()==product3.getId()) {
				
						entityManager.remove(product1);
					}

		}
		
		entityTransaction.commit();
		System.out.println(" Successfully delete...");
	}
	
	
	// This method is used for displayCustmerAndProduct
	
	public List<Product> displyProCus(){
		
		String select="Select s from Product s";
		  Query query=entityManager.createQuery(select);
		  
		  return query.getResultList();
	}
	
	
}
