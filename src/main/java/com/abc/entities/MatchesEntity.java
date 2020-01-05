package com.abc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "matches")
public class MatchesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "location")
	private String location;

	@Column(name = "match_date")
	private Date matchDate;

	@OneToOne
	@JoinColumn(name = "away_team_id")
	private TeamEntity awayTeam;

	@OneToOne
	@JoinColumn(name = "home_team_id")
	private TeamEntity homeTeam;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public TeamEntity getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(TeamEntity awayTeam) {
		this.awayTeam = awayTeam;
	}

	public TeamEntity getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(TeamEntity homeTeam) {
		this.homeTeam = homeTeam;
	}

}
