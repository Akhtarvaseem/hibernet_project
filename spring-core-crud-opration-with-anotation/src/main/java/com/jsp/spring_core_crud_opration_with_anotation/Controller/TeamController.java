package com.jsp.spring_core_crud_opration_with_anotation.Controller;

import java.applet.AppletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_crud_opration_with_anotation.MyConfigration;
import com.jsp.spring_core_crud_opration_with_anotation.dto.Team;
import com.jsp.spring_core_crud_opration_with_anotation.service.ServiceTeam;

public class TeamController {

	@Autowired
	ServiceTeam service;
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfigration.class);
		
		ServiceTeam service=(ServiceTeam)applicationContext.getBean("service");
		Team team=(Team)applicationContext.getBean("team");
		
		team.setId(56);
		team.setName("Ghayal");
		team.setRank(5);
		
		service.insertTeam(team);
		
		
	}

}
