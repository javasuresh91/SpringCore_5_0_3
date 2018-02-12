package com.annotation.config;

import org.springframework.beans.factory.annotation.Required;

public class SimpleMovieLister {
	
	private MovieFinder movieFinder;

	public MovieFinder getMovieFinder() {
		return movieFinder;
	}
	@Required
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	
	

}
