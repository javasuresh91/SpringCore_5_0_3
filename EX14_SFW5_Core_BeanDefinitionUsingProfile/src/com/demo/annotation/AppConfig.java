package com.demo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.getEnvironment()
				.setActiveProfiles("development"); /* By Changing the Profile name we can see the differented bean */
		context.register(ConfigurationBuildOne.class,ConfigurationBeanTwo.class,ConfigurationBeanThree.class);
		context.refresh();
		System.out.println("--- Loading Completed ----------");
		for (String name : context.getBeanDefinitionNames())
			System.out.println(name);
		System.out.println("--- List Bean Names  Completed ----------");

	}

}
