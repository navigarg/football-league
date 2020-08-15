package com.football.services.country.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.services.country.model.League;
import com.football.services.country.repository.LeagueRepository;
import com.football.services.country.service.LeagueService;

import java.util.List;

@Service
public class LeagueServiceImpl implements LeagueService {

    @Autowired 
    LeagueRepository leagueRepository;

	@Override
	public League post(League entity) {
		return leagueRepository.save(entity);
	}

	@Override
	public List<League> get() {
		return leagueRepository.findAll();
	}

	@Override
	public void put(League entity) {
		leagueRepository.save(entity);
	}

	@Override
	public void delete(League entity) {
		leagueRepository.delete(entity);
	}

}
