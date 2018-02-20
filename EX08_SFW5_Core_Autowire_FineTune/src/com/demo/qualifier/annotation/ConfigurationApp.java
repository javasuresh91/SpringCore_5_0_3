package com.demo.qualifier.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.demo.qualifier.annotation")
public class ConfigurationApp {
	
	@Bean
	@Qualifier("beanFirst")
	public TestBeanOne testBeanFirst() {
		return new TestBeanOne();
	}


	@Bean
//	@Qualifier("beanSecond")
	@CustomQualifier("beanSecond")
	public TestBeanOne testBeanSecond() {
		System.out.println("Annotation Bean");
		return new TestBeanOne();
	}
}
