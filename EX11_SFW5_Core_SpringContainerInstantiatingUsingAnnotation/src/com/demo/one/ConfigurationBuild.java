package com.demo.one;

import org.springframework.context.annotation.Bean;

/**
 * Without using @ComponentScan
 * @author SR00492780
 *
 */
@org.springframework.context.annotation.Configuration
public class ConfigurationBuild {
	
	
	@Bean
	public TestBeanOne beanOne() {
		return new TestBeanOne();
	}

}
