package com.abc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dtos.MatchesDto;
import com.abc.services.MatchesService;

@RestController
@RequestMapping("/match")
public class MatchesController {
	@Autowired
	MatchesService match;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createMatch(@RequestBody MatchesDto dto) {
		System.out.println(dto.toString());
		match.createtMatch(dto);

	}

}
