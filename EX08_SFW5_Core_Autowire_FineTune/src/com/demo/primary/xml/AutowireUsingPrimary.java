package com.demo.primary.xml;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowireUsingPrimary {

	@Autowired
	private TestBeanOne testBeanOnee;

	public TestBeanOne getTestBeanOnee() {
		return testBeanOnee;
	}

	public void setTestBeanOnee(TestBeanOne testBeanOnee) {
		this.testBeanOnee = testBeanOnee;
	}

}
