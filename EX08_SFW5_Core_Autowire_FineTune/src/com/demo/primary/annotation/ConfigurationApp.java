package com.demo.primary.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp {
	
	@Bean
	public TestBeanOne testBeanFirst() {
		return new TestBeanOne();
	}


	@Bean
	public TestBeanOne testBeanSecond() {
		return new TestBeanOne();
	}
}
