package com.demo.di;

public class ConstructorBasedInjectionThree {

	private String dataOne;
	private int dataTwo;

	public ConstructorBasedInjectionThree(String dataOne, int dataTwo) {
		this.dataOne = dataOne;
		this.dataTwo = dataTwo;
	}

	public String getDataOne() {
		return dataOne;
	}

	public int getDataTwo() {
		return dataTwo;
	}
	
	
	

}
