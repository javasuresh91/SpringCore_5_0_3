package com.demo.model;

public class Circle {
	
	private String name;

	public String getName() {
		getTestName();
		return name;
	}

	public void setName(String name) {
		System.out.println("set");
		this.name = name;
	}
	
	private void getTestName() {
		System.out.println("Private Method Called");
	}
	

}
