package com.jsp.hibernet_crud_opration_train.service;

import java.util.List;

import com.jsp.hibernet_crud_opration_train.dao.TrainDao;
import com.jsp.hibernet_crud_opration_train.dto.Train;

public class TrainService {
    TrainDao dao=new TrainDao();
	public void trainInsert(Train train) {
		dao.trainInsert(train);
	}
	
	
	public void trainUpdate(Train train) {
		dao.trainUpdate(train);
	}
	
	
	public void trainDelete(int trainNo) {
		dao.trainDelete(trainNo);
	}
	
	public List<Train> trainDisplay( ){
		return dao.trainDisplay();
	}
	
	
	 // delete the data with JPQL query 
	

    public void deleteJPQL(int id){
    	dao.deleteJPQL(id);
    }
}
