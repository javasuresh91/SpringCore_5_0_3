package com.annotation.config;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class CollectionAutowire {
	Set<MovieFinder> setOfMovieFinder;

	@Autowired
	public Set<MovieFinder> getSetOfMovieFinder() {
		return setOfMovieFinder;
	}

	public void setSetOfMovieFinder(Set<MovieFinder> setOfMovieFinder) {
		this.setOfMovieFinder = setOfMovieFinder;
	}
	
	
}
