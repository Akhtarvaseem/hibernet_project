package om.qsp.one_to_many_job_condidates_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Condidates {

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
	public long getCellNum() {
		return cellNum;
	}
	public void setCellNum(long cellNum) {
		this.cellNum = cellNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String name;
	private long cellNum;
	private String email;
}
