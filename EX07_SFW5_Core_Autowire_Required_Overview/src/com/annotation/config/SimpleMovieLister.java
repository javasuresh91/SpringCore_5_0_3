package com.annotation.config;

import org.springframework.beans.factory.annotation.Required;

/**
 * @Reuired is used to force the container should have the value for the @Required property
 * @author SR00492780
 *
 */
public class SimpleMovieLister {
	
	private MovieFinder movieFinder;
	private String movieName;
	
	
	public String getMovieName() {
		return movieName;
	}

	@Required
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public MovieFinder getMovieFinder() {
		return movieFinder;
	}
	@Required
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	
	

}
