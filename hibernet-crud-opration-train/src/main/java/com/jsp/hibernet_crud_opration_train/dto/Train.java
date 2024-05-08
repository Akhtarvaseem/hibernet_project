package com.jsp.hibernet_crud_opration_train.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="deleteQuery",query="Delete From Train t where t.trainNo=:trainNo") //name query..
public class Train {
    @Id
	private int trianNo;
	private String trainName;
	private String distnation;
	
	
	public int getTrianNo() {
		return trianNo;
	}
	
	public void setTrianNo(int trianNo) {
		this.trianNo = trianNo;
	}
	
	public String getTrainName() {
		return trainName;
	}
	
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	public String getDistnation() {
		return distnation;
	}
	public void setDistnation(String distnation) {
		this.distnation = distnation;
	}
	
	
}
