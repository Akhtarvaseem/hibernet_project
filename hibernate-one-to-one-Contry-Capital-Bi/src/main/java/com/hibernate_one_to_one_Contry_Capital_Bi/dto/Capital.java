package com.hibernate_one_to_one_Contry_Capital_Bi.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Capital {
    
	@Id
	private int id;
	private String name;
	private long population;
	
	
	@OneToOne(mappedBy = "capital")   // it is used to mapped one object to another object its dependent country
	private Country country;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
//	@Override
//	public String toString() {
//		return "Capital_Country [id=" + id + ", name=" + name + ", population=" + population + ", contryId="+country.getId()+",contryId="+country.getId()+",contryPopulation="+country.getPopulation()+",countryArea="+country.getArea()+"]";
//	}
	
}
