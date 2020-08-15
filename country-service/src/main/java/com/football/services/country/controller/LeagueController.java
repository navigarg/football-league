package com.football.services.country.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.football.services.country.interfaces.GenericOperations;
import com.football.services.country.model.League;
import com.football.services.country.service.LeagueService;

@RestController 
@RequestMapping(path = "/league")
public class LeagueController implements GenericOperations<League> {

    @Autowired 
    public LeagueService leagueService;

    @Override
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE}
    )
    public League post(@RequestBody League entity) {
        return leagueService.post(entity);
    }

    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public List<League> get() {
        return leagueService.get();
    }

    @Override
    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public void put(@RequestBody League entity) {
        leagueService.put(entity);
    }

    @Override
    @DeleteMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public void delete(@RequestBody League entity) {
        leagueService.delete(entity);
    }
}
