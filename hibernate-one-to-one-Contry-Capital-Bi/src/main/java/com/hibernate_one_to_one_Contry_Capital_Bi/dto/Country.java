package com.hibernate_one_to_one_Contry_Capital_Bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Country {
    
	@Id
	private int id;
	private String name;
	private long population;
	private Double area;
	
	
	// cascade is use for perform the operation throw country primary object
	//@joinColumn is used for modify forenKey  name 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="captial_id")
	private Capital capital;

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

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

//	@Override
//	public String toString() {
//		return "Country [id=" + id + ", name=" + name + ", population=" + population + ", area=" + area + "]";
//	}
	
	
}
