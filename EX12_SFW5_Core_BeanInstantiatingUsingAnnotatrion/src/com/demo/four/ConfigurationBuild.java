package com.demo.four;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationBuild {

	@Bean(name= {"foo","foo1"})
	@Scope("prototype")
	@Description("Provides a Scope and Custome naming bean and Alias Naming of a bean")
	public TestBeanOne getBeanOne() {
		return new TestBeanOne();
	}
}
