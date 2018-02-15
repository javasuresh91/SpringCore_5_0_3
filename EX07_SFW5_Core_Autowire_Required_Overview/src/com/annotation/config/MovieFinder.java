package com.annotation.config;

import org.springframework.beans.factory.annotation.Required;

public class MovieFinder {

	
	private String movieName;
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
