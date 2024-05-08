package com.jsp.crud_opration_cricketteam.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CricketTeam {
	@Id
	private int teamId;
	private String teamName;
	private String teamCaptain;
	private String teamCoach;
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamCaptain() {
		return teamCaptain;
	}
	public void setTeamCaptain(String teamCaptain) {
		this.teamCaptain = teamCaptain;
	}
	public String getTeamCoach() {
		return teamCoach;
	}
	public void setTeamCoach(String teamCoach) {
		this.teamCoach = teamCoach;
	}

}
