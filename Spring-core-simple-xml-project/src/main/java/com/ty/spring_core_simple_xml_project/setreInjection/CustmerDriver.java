package com.ty.spring_core_simple_xml_project.setreInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustmerDriver {

	public static void main(String[] args) {
		// This is setter and getter  Injection 
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("myspring.xml");
		
	Cutomer customer= 	(Cutomer) applicationContext.getBean("injection");

	  System.out.println(customer.getIs());
	  System.out.println(customer.getName());
	  System.out.println(customer.getEamil());
	}

}
