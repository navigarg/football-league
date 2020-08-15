package com.football.services.country.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Country  extends DefaultModel{

	private String name;

	@OneToMany(mappedBy = "country", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<League> leagues;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<League> getLeagues() {
		return leagues;
	}

	public void setLeagues(Set<League> leagues) {
		this.leagues = leagues;
	}



}
