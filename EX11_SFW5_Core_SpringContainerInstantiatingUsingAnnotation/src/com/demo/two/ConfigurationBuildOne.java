package com.demo.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBuildOne {

	@Bean
	public TestBeanOne getBeanOne( ) {
		return new TestBeanOne(); 
	}
}
