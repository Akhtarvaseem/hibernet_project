package com.jsp.spring_core_with_anotation.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CountryDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(CountryConfig.class);
		Country country=(Country) applicationContext.getBean("myname");
		
		// you can write here your Base Class name or here you can our own configuration name
//		Country country=(Country) applicationContext.getBean("country");  
		country.getDisplayCountry();

	}

}
