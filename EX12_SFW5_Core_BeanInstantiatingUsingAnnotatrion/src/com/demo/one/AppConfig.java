package com.demo.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBuild.class);
		System.out.println("--- Loading Completed ----------");
		for (String name : context.getBeanDefinitionNames())
			System.out.println(name);
		System.out.println("--- List Bean Names  Completed ----------");

	}

}
