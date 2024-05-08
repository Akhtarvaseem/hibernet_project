package com.jsp.one_to_one_LaptopProceser_uni.service;

import java.util.List;

import com.jsp.one_to_one_LaptopProceser_uni.dao.LapProDao;
import com.jsp.one_to_one_LaptopProceser_uni.dto.Laptop;
import com.jsp.one_to_one_LaptopProceser_uni.dto.Processor;

public class LapProService {

	LapProDao dao=new LapProDao();
	public void insertDao(Laptop laptop ,Processor processor) {
		
		dao.insertDao(laptop, processor);
	}
	
	public void updateDao(int id, Double price, String core) {
		
		 dao.updateDao(id, price, core);
	}
	
	public void delteDao(int id) {
		dao.delteDao(id);
	}
	
	public List<Laptop> Dispaly(){
		return dao.Dispaly();
	}
	
	public void updateAllDao(int id, Laptop laptop, Processor processor) {
		dao.updateAllDao(id, laptop, processor);
	}
}
