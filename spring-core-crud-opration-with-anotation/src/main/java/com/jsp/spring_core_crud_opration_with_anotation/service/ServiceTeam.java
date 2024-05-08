package com.jsp.spring_core_crud_opration_with_anotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.spring_core_crud_opration_with_anotation.dao.TeamDao;
import com.jsp.spring_core_crud_opration_with_anotation.dto.Team;

@Component("service")
public class ServiceTeam {
	@Autowired
    TeamDao dao;
	public void insertTeam(Team team) {
		dao.insertTeam(team);
	}
	
	
    // For update 
    public void updateTeam(Team team) {
    	dao.updateTeam(team);
    }
    
    
// for delete
    
    public void deleteTeam(Team team) {
    	dao.deleteTeam(team);
    }
    
 //for display
    
    public List<Team> display(){
    	return dao.display();
    }
}
