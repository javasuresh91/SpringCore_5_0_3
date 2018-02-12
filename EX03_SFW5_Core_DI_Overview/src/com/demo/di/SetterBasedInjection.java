package com.demo.di;

public class SetterBasedInjection {

	private ExampleBean exampleBean;

	public ExampleBean getExampleBean() {
		return exampleBean;
	}

	public void setExampleBean(ExampleBean exampleBean) {
		this.exampleBean = exampleBean;
	}

}
