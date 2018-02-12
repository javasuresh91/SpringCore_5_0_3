package com.demo.di;

public class ConstructorBasedInjectionOne {

	private String dataOne;
	private String dataTwo;

	public ConstructorBasedInjectionOne(String dataOne, String dataTwo) {
		this.dataOne = dataOne;
		this.dataTwo = dataTwo;
	}

	public String getDataOne() {
		return dataOne;
	}

//	public void setDataOne(String dataOne) {
//		this.dataOne = dataOne;
//	}

	public String getDataTwo() {
		return dataTwo;
	}

//	public void setDataTwo(String dataTwo) {
//		this.dataTwo = dataTwo;
//	}

}
