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
import com.football.services.country.model.Country;
import com.football.services.country.service.CountryService;

@RestController 
@RequestMapping(path = "/country")
public class CountryController implements GenericOperations<Country> {

    @Autowired 
    public CountryService countryService;

    @Override
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE}
    )
    public Country post(@RequestBody Country entity) {
        return countryService.post(entity);
    }

    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public List<Country> get() {
        return countryService.get();
    }

    @Override
    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public void put(@RequestBody Country entity) {
        countryService.put(entity);
    }

    @Override
    @DeleteMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public void delete(@RequestBody Country entity) {
        countryService.delete(entity);
    }
}
