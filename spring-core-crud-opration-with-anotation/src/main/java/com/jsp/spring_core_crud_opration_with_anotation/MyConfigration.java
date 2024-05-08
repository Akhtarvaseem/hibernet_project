package com.jsp.spring_core_crud_opration_with_anotation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.jsp.spring_core_crud_opration_with_anotation")
public class MyConfigration {
	
	@Bean
	public EntityManagerFactory getEntityManagerFactory() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
		
		return entityManagerFactory; 
	}

}
