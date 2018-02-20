package com.demo.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBuildTwo {
	
	@Bean
	public TestBeanTwo getBeanTwo() {
		return new TestBeanTwo();
	}

}
