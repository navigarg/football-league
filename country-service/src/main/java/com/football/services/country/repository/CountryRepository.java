package com.football.services.country.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.services.country.model.Country;

@Repository
public interface CountryRepository extends
        JpaRepository<Country,Integer> {

    List<Country> findCountrysByName(String name);

}
