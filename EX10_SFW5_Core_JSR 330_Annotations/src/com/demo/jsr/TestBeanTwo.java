package com.demo.jsr;

import javax.inject.Inject;
import javax.inject.Named;

@Named("nameBeanTwo")
public class TestBeanTwo {

	private TestBean testBean;

	public TestBean getTestBean() {
		return testBean;
	}

	@Inject
	public void setTestBean(@Named("main") TestBean testBean) {
		System.out.println("Second Bean Injected");
		testBean.setDataOne("Two");
		this.testBean = testBean;
	}
}
