package com.demo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("live")
public class ConfigurationBeanTwo {

	@Bean("getBean")
	public TestBean getProfileBean() {
		System.out.println("Production Bean -Class Level Profile");
		return new TestBean();
	}
}
