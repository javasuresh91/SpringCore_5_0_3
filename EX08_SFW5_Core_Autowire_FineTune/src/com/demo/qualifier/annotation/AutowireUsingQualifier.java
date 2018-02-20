package com.demo.qualifier.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutowireUsingQualifier {

	@Autowired	
//	@Qualifier("beanSecond")
	@CustomQualifier("beanSecond")
	private TestBeanOne testBeanOnee;

	public TestBeanOne getTestBeanOnee() {
		return testBeanOnee;
	}

	public void setTestBeanOnee(TestBeanOne testBeanOnee) {
		this.testBeanOnee = testBeanOnee;
	}

}
