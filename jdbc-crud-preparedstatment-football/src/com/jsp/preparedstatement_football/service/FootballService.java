package com.jsp.preparedstatement_football.service;

import java.util.List;

import com.jsp.preparedstatement_football.dao.FootbalDao;
import com.jsp.preparedstatement_football.dto.Footbal;

public class FootballService {
	
     FootbalDao dao=new FootbalDao();
	public void footBallInsert(Footbal footbal) {
		dao.footBallInsert(footbal);
	}
	
	 public void InsertAddBatch(List<Footbal> footbal) {
		 dao.InsertAddBatch(footbal);
	 }
	
	public void Update(int id, String name, int goal) {
		dao.Update(id, name, goal);
	}
	
	public void deleteData(int id) {
		dao.deleteData(id);
	}
	
	public List<Footbal> dispFootbal(){
		return dao.dispFootbal();
	}

}
