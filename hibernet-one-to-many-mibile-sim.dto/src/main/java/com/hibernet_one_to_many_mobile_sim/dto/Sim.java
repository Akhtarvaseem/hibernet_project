package com.hibernet_one_to_many_mobile_sim.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sim {
   
	    @Id
		private int id;
	    private String SimName;
	    private String networkType;
	    private String size;
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSimName() {
			return SimName;
		}
		public void setSimName(String simName) {
			SimName = simName;
		}
		public String getNetworkType() {
			return networkType;
		}
		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
}
