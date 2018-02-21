package com.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
public class ConfigurationBeanThree {
	
	@Autowired
    Environment env;
	
	
	@Bean(name="getBeanTwo")
	@Profile("live")
	public TestBean getProfileBean() {
		System.out.println("Production Bean -Method Level Profile");
		return new TestBean();
	}
	
	@Bean(name="getBeanTwo")
	@Profile("development")
	public TestBean getBean() {
		System.out.println("Development Bean - Method Level Profile");
		System.out.println("Value Loaded form the Prop files by @PropertySource : "+env.getProperty("temps"));
		return new TestBean();
	}
	

}
