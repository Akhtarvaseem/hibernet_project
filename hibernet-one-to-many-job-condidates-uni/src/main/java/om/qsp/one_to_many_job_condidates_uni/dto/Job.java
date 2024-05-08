package om.qsp.one_to_many_job_condidates_uni.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Job {
    
	@Id
	private int compId;
	private String comName;
	private String comPosition;
	private double Package;
	
	@OneToMany
	private List<Condidates> condidates;

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getComPosition() {
		return comPosition;
	}

	public void setComPosition(String comPosition) {
		this.comPosition = comPosition;
	}

	public double getPackage() {
		return Package;
	}

	public void setPackage(double package1) {
		Package = package1;
	}

	public List<Condidates> getCondidates() {
		return condidates;
	}

	public void setCondidates(List<Condidates> condidates) {
		this.condidates = condidates;
	}
	
}
