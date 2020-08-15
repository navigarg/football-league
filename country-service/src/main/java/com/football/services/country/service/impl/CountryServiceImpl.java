package com.football.services.country.service.impl;

import com.football.services.country.model.Country;
import com.football.services.country.repository.CountryRepository;
import com.football.services.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired 
    CountryRepository countryRepository;

    @Override
    public Country post(Country entity) {
        Country p = countryRepository.save(entity);
        return p;
    }

    @Override
    public List<Country> get() {
        return countryRepository.findAll();
    }

    @Override
    public void put(Country entity) {
        countryRepository.save(entity);

    }

    @Override
    public void delete(Country entity) {
        countryRepository.delete(entity);

    }

    public List<Country> findCountrysByName(String name){
        return countryRepository.findCountrysByName(name);
    }
}
