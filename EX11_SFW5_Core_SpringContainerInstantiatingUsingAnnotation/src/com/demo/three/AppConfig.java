package com.demo.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBuild.class);
		System.out.println("--- Loading Completed ----------");
		for (String name : context.getBeanDefinitionNames())
			System.out.println(name);
		System.out.println("--- List Bean Names  Completed ----------");
		
		/**
		 * Other Type of Scan Component
		 */
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.demo.three");
		ctx.refresh(); // It is optional in this case
		System.out.println("--- Second Loading Completed ----------");
		for (String name : ctx.getBeanDefinitionNames())
			System.out.println(name);
		System.out.println("--- List Bean Names  Completed ----------");

	}

}
