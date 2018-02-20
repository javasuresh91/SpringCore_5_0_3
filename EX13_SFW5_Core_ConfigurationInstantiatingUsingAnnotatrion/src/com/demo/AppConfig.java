package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigurationBuildOne.class);
		System.out.println("--- Loading Completed ----------");
		for (String name : context.getBeanDefinitionNames())
			System.out.println(name);
		System.out.println("--- List Bean Names  Completed ----------");

	}

}
