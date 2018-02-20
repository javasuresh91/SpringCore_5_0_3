package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ConfigurationBuildTwo.class})
public class ConfigurationBuildOne {

	@Bean
	public TestBeanOne getBeanOne()
	{
		return new TestBeanOne();
	}
}
