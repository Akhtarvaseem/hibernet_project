package com.jsp.spring_core_crud_opration_with_anotation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_crud_opration_with_anotation.MyConfigration;
import com.jsp.spring_core_crud_opration_with_anotation.dto.Team;
import com.jsp.spring_core_crud_opration_with_anotation.service.ServiceTeam;

public class UpdateController {
    @Autowired
	ServiceTeam service;
	public static void main(String[] args) {
		// for update 
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfigration.class);
		
		Team team= (Team) applicationContext.getBean("team");
		ServiceTeam serviceTeam= (ServiceTeam)applicationContext.getBean("service");
		
		team.setId(55);
		team.setName("Ghatak");
		team.setRank(2);

		serviceTeam.updateTeam(team);
		
	}

}
