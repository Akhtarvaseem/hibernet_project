package com.hibernate_one_to_one_Contry_Capital_Bi.service;

import java.util.List;

import com.hibernate_one_to_one_Contry_Capital_Bi.dao.capContryDao;
import com.hibernate_one_to_one_Contry_Capital_Bi.dto.Capital;
import com.hibernate_one_to_one_Contry_Capital_Bi.dto.Country;

public class capCountryService {

	capContryDao dao=new capContryDao();
	public void insertCapCon(Country country, Capital capital) {
		dao.insertCapCon(country, capital);
	}
	
	// update capital and country 
	
	public void  updateCapCountry(int id,String CapName, String countryName) {
		dao.updateCapCountry(id, CapName, countryName);
	}
	
	// delete capital and country 
	
	public void  deleteCapCountry(int id) {
		dao.deleteCapCountry(id);
	}
	
//  Display the database
	public List<Capital> DisplyCapCoun(){
		 return dao.DisplyCapCoun();
	}
}
