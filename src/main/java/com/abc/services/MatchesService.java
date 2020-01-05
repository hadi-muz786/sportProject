package com.abc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dtos.MatchesDto;
import com.abc.entities.MatchesEntity;
import com.abc.entities.TeamEntity;
import com.abc.repositories.MatchesRepository;
import com.abc.repositories.TeamRepository;

@Service
public class MatchesService {
	@Autowired
	private MatchesRepository matchesRepository;
	@Autowired
	private TeamRepository teamRepository;

	public void createtMatch(MatchesDto dto) {
		TeamEntity homeTeam = teamRepository.getById(dto.getHomeTeam());

		TeamEntity awayTeam = teamRepository.getById(dto.getAwayTeam());

		MatchesEntity matchen = convertDto(dto);

		matchen.setHomeTeam(homeTeam);
		matchen.setAwayTeam(awayTeam);
		matchesRepository.save(matchen);
	}

	public MatchesEntity convertDto(MatchesDto dto) {

		MatchesEntity matchen = null;

		if (dto != null) {

			matchen = new MatchesEntity();

			matchen.setId(dto.getId());
			matchen.setLocation(dto.getLocation());
			matchen.setMatchDate(dto.getMatchDate());

		}
		return matchen;

	}

}
