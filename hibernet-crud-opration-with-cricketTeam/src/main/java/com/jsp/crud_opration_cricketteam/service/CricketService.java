package com.jsp.crud_opration_cricketteam.service;

import java.util.List;

import com.jsp.crud_opration_cricketteam.dao.CricketDao;
import com.jsp.crud_opration_cricketteam.dto.CricketTeam;

public class CricketService {
	 CricketDao dao=new CricketDao();
	public void insertDao(CricketTeam cricket) {
		dao.insertDao(cricket);
	}
	
	public void updateDao(int id,CricketTeam cricket) {
		dao.updateDao(id,cricket);
	}
	
	public void deleteDao(int teamId) {
		dao.deleteDao(teamId);
	}
	
	public List<CricketTeam> dispalyDao()
	{
		
		return dao.dispalyDao();
	}

}
