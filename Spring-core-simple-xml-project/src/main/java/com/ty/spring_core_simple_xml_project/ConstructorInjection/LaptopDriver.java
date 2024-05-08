package com.ty.spring_core_simple_xml_project.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		
	
	Laptop laptop=	(Laptop) applicationContext.getBean("ConstructorInjection");
//		laptop.display();
	System.out.println(laptop);

	}

}
