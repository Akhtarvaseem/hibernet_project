package com.hibernet_one_to_many_mobile_sim.service;

import java.util.List;


import com.hibernet_one_to_many_mobile_sim.dao.MobSimDao;
import com.hibernet_one_to_many_mobile_sim.dto.Mobile;
import com.hibernet_one_to_many_mobile_sim.dto.Sim;

public class MobSimService {

	MobSimDao dao=new MobSimDao();


	
// InsertSimMobile in database
		public void simMobileInsert(List<Sim> sim, Mobile mobile) 
		{
			dao.simMobileInsert(sim, mobile);
		}
	
//AllSims 
	public List<Sim> getAllSims(){
		return dao.getAllSims();
	}
	
	
//Update SimMoble data
		public void updateMobSim(Mobile mobile ,List<Sim> sim) {
			dao.updateMobSim(mobile, sim);
		}
	
// update the simMobile Not all	
		public void updateMobile(int mobileId, int simId, String mobileBrand, String SimType) {
			dao.updateMobile(mobileId, simId, mobileBrand, SimType);
		}
	
//delete mobileSim data 
	public void deleteMobileSim(int mId) {
		dao.deleteMobileSim(mId);
	}
	
// display details 
	 public List<Mobile> displayMobSim(){
		 return dao.displayMobSim();
	 }
}
