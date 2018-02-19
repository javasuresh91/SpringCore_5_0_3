package com.demo.jsr;

import javax.inject.Inject;
import javax.inject.Named;

@Named  // @ManagedBean("movieListener") could be used as well
public class TestBeanOne {
	
	private TestBean testBean;

	public TestBean getTestBean() {
		return testBean;
	}

	@Inject
	public void setTestBean(@Named("getFirstBean") TestBean testBean) {
		System.out.println("First Bean Injected");
		testBean.setDataOne("One");
		this.testBean = testBean;
	}
	
	

}
