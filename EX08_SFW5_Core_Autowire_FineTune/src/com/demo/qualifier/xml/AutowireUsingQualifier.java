package com.demo.qualifier.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutowireUsingQualifier {

	@Autowired	
//	@Qualifier("beanSecond")
	@CustomQualifier(value="beanSecond")
	private TestBeanOne testBeanOnee;

	public TestBeanOne getTestBeanOnee() {
		return testBeanOnee;
	}

	public void setTestBeanOnee(TestBeanOne testBeanOnee) {
		this.testBeanOnee = testBeanOnee;
	}

}
