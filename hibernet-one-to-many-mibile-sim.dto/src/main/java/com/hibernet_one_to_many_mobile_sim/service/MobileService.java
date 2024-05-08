package com.hibernet_one_to_many_mobile_sim.service;

import java.util.List;

import com.hibernet_one_to_many_mobile_sim.dao.MobSimDao;
import com.hibernet_one_to_many_mobile_sim.dao.MobileDao;
import com.hibernet_one_to_many_mobile_sim.dto.Mobile;
import com.hibernet_one_to_many_mobile_sim.dto.Sim;

public class MobileService {

	MobileDao dao=new MobileDao();
	MobSimDao dao2=new MobSimDao();
	
	public void insertMobile(Mobile mobile) {
		
//		List<Sim> sim= dao2.getAllSims();
		
//		mobile.setSim(sim);
		dao.insertMobile(mobile);
 	}
	
// updateMobile Data from database
			public void updateMobile( Mobile mobile) {
				dao.updateMobile(mobile);
			}
			
// deleteMobile
	public void deleteMobile(int id) {
		dao.deleteMobile(id);
	}
}
