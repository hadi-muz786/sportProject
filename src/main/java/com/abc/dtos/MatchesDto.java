package com.abc.dtos;

import java.util.Date;

public class MatchesDto {

	private Long id;
	private Long homeTeam;
	private Long awayTeam;
	private Date matchDate;
	private String location;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Long homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Long getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Long awayTeam) {
		this.awayTeam = awayTeam;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
