package com.jsp.hibernet_project_car_custmer.service;



import com.jsp.hibernet_project_car_custmer.dao.PersionDao;
import com.jsp.hibernet_project_car_custmer.dto.Address;

import com.jsp.hibernet_project_car_custmer.dto.Pan;
import com.jsp.hibernet_project_car_custmer.dto.Persion;

public class PersionService {

	PersionDao dao=new PersionDao();
	public void insertPersion(Pan pan, Address addredss,Persion persion) {
		dao.insertPersion(pan, addredss, persion);
	}
	
	public void updatePersion(Pan pan, Address addredss, Persion persion) {
		dao.updatePersion(pan, addredss, persion);
	}
	
	// Delete pan, address ,person
	
	
		public void deletePersion(Persion persion) {
			dao.deletePersion(persion);
		}
}
