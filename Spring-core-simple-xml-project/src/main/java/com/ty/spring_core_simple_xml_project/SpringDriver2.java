package com.ty.spring_core_simple_xml_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringDriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("myspring.xml");
		
		MySpring2 mySpring2=(MySpring2) applicationContext.getBean("MySpring2");
		mySpring2.getStudent();
	}

}
