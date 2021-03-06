package com.abc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dtos.PlayerDto;
import com.abc.services.PlayerService;

@RestController
@RequestMapping("/player")
class PlayerController {

	@Autowired
	private PlayerService playerService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void addplayer(@RequestParam(value = "teamId") Long teamId, @RequestBody PlayerDto playerDto)
			throws Exception {

		playerService.createPlayer(teamId, playerDto);

	}
} 