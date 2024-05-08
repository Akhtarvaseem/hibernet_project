package com.hibernet_one_to_many_mobile_sim.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {
    @Id
	private int id;
	private String mobileBrand;
	private String mobileCamra;
	private int mobilePrice;
	
	
	@OneToMany
	private List<Sim> sim;
	
	
	public List<Sim> getSim() {
		return sim;
	}
	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public String getMobileCamra() {
		return mobileCamra;
	}
	public void setMobileCamra(String mobileCamra) {
		this.mobileCamra = mobileCamra;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	
}
