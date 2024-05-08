package com.jsp.spring_core_with_anotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="myname")
public class Country{
	
	@Value(value="1")
	private int a;
	
	@Value(value="India")
	private String name;
	
	@Value(value="Delhi")
	private String capital;

	public void getDisplayCountry() {
		System.out.println("county code ="+a);
		System.out.println("county name ="+name);
		System.out.println("county capital ="+capital);
	}
}
