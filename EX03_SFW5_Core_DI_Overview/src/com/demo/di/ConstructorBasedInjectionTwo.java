package com.demo.di;

public class ConstructorBasedInjectionTwo {
	
	private ExampleBean exampleBean;

	public ConstructorBasedInjectionTwo(ExampleBean exampleBean) {
		this.exampleBean = exampleBean;
	}

	public ExampleBean getExampleBean() {
		return exampleBean;
	}
	
	

}
