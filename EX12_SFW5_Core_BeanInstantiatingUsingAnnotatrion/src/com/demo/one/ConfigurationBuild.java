package com.demo.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBuild {
	
	/**
	 * Class Level
	 * @return
	 */
	@Bean
	public TestBeanImpl getBeanImpl() {
		return new TestBeanImpl();
	}
	
	/**
	 * interface Level
	 * @return
	 */
	@Bean
	public TestBean getBean() {
		return new TestBeanImpl();
	}

	
}
