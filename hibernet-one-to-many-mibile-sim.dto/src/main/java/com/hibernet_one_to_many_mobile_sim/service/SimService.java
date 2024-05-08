package com.hibernet_one_to_many_mobile_sim.service;

import java.util.List;

import com.hibernet_one_to_many_mobile_sim.dao.SimDao;
import com.hibernet_one_to_many_mobile_sim.dto.Sim;

public class SimService {
    SimDao dao=new SimDao(); 
	
	//Insert data into sim 
		public void simInsert(List<Sim> sim) {
			
			dao.simInsert(sim);
		}
		
// updateData from database
		
		public void updateSim( Sim sim) {
			dao.updateSim(sim);
		}
		
// delteSim data
		public void deleteSim(int id) {
			dao.deleteSim(id);
		}
		
}
