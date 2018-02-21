package com.demo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class ConfigurationBuildOne {
	
	@Bean("getBean")
	public TestBean getProfileBean() {
		System.out.println("Development Bean - Class Level Profile");
		return new TestBean();
	}

}
