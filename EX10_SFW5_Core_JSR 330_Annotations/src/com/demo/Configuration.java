package com.demo;

import javax.inject.Named;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.demo.jsr.TestBean;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages="com.demo.jsr")
public class Configuration {
	
	@Bean()
	@Named(value="main")
	public TestBean getFirstBean() {
		return new TestBean();
	}
	
	@Bean
	public TestBean getSecondBean() {
		return new TestBean();
	}

}
