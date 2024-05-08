package com.jsp.one_to_one_LaptopProceser_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Processor {
	
    @Id
	private int id;
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	private String name;
	private  int  speed;
	
	private String core;
}
