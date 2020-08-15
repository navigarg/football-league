package com.football.services.country.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.services.country.model.League;
@Repository
public interface LeagueRepository extends
        JpaRepository<League,Integer> {

    List<League> findLeagureByName(String name);

}
