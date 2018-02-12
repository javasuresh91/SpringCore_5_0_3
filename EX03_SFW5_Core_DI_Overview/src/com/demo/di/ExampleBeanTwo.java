package com.demo.di;

public class ExampleBeanTwo {
	
	private String name;
	private ExampleBean beanData;

	public ExampleBeanTwo(String name, ExampleBean beanData) {
		this.name = name;
		this.beanData = beanData;
	}

	public String getName() {
		return name;
	}

	public ExampleBean getBeanData() {
		return beanData;
	}

	
	
	

}
