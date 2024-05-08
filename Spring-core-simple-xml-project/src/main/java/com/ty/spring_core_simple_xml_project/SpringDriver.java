package com.ty.spring_core_simple_xml_project;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringDriver {

	public static void main(String[] args) {
		
		ClassPathResource classPathResource =new ClassPathResource("myspring.xml");
		
	
		 BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		 MySpring1 mySpring1= (MySpring1) beanFactory.getBean("MySpring");
		 
		 mySpring1.mySpring();

	}

}
