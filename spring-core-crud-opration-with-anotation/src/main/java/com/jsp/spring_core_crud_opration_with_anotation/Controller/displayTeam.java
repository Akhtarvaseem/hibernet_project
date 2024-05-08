package com.jsp.spring_core_crud_opration_with_anotation.Controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_crud_opration_with_anotation.MyConfigration;
import com.jsp.spring_core_crud_opration_with_anotation.dto.Team;
import com.jsp.spring_core_crud_opration_with_anotation.service.ServiceTeam;

public class displayTeam {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfigration.class);
		
//		List<Team> team= (List<Team>) applicationContext.getBean("team");
		ServiceTeam serviceTeam= (ServiceTeam)applicationContext.getBean("service");
		
		List<Team> team1 =   serviceTeam.display();
		
		for (Team team2 : team1) {
			System.out.println("Team id "+team2.getId());
			System.out.println("Team name "+team2.getName());
			System.out.println("Team Rank  "+team2.getRank());
			System.out.println("Date and Time "+team2.getDateTime());
		}
		

	}

}
