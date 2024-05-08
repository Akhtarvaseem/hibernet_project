package com.jsp.spring_core_crud_opration_with_anotation.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_crud_opration_with_anotation.MyConfigration;
import com.jsp.spring_core_crud_opration_with_anotation.dto.Team;
import com.jsp.spring_core_crud_opration_with_anotation.service.ServiceTeam;

public class DeleteTeam {

	
	public static void main(String[] args) {
		// For delete
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfigration.class);
	Team team=	(Team)applicationContext.getBean("team");
	ServiceTeam service=	(ServiceTeam)applicationContext.getBean("service");
	
	team.setId(55);
	service.deleteTeam(team);

	}

}
