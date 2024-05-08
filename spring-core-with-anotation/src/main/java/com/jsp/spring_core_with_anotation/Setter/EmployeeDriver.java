package com.jsp.spring_core_with_anotation.Setter;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_with_anotation.dto.CountryConfig;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CountryConfig.class);
		Employee employee=(Employee) applicationContext.getBean("employee");
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getEmail());
	}

}
