package com.demo.model;

import com.demo.aspect.Loggable;


public class Circle {
	
	private String name;
	@Loggable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
