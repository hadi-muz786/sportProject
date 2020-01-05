package com.abc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dtos.TeamDto;
import com.abc.services.TeamService;

@RestController

@RequestMapping("/team")
public class TeamController {
	@Autowired
	private TeamService teamService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createTeam(@RequestBody TeamDto dto) {
		teamService.createTeam(dto);

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<TeamDto> getAllTeams(@RequestParam(required = false) Integer limit,
			@RequestParam(required = false) Integer offset) {

		return teamService.getAllTeam();
	}

}
