package com.hibernet_many_to_many_custmor_product_bi.service;

import java.util.List;

import com.hibernet_many_to_many_custmor_product_bi.dao.ProductCustmorDao;
import com.hibernet_many_to_many_custmor_product_bi.dto.Custmor;
import com.hibernet_many_to_many_custmor_product_bi.dto.Product;

public class ProductCustmorService {

	
	ProductCustmorDao dao= new ProductCustmorDao();
	public void proCusInsert(List<Custmor> custmor, List<Product> product) {
		dao.proCusInsert(custmor, product);
	}
	
	// This method is used for updateCustmerAndProduct
		public void updateProCus(List<Product> product) {
			dao.updateProCus(product);
		}
		
	// This method is used for deleteCustmerAndProduct
		public void deleteProCus(List<Product> product) {
			dao.deleteProCus(product);
		}
		
		// This method is used for displayCustmerAndProduct
		
		public List<Product> displyProCus(){
			return dao.displyProCus();
		}
}

