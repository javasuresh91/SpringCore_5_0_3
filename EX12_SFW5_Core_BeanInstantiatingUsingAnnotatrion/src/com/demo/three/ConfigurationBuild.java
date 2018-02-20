package com.demo.three;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBuild {

	@Bean(initMethod="startUP",destroyMethod="endUp")
	public TestBean getTestBean() {
		return new TestBean();
	}
}
