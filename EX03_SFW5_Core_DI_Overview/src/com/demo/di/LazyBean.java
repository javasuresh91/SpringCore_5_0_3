package com.demo.di;

public class LazyBean {

	private String dataOne;

	public String getDataOne() {
		return dataOne;
	}

	public void setDataOne(String dataOne) {
		System.out.println("Lazy Started");
		this.dataOne = dataOne;
	}

}
