package com.demo.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "development");
		ApplicationContext context = new ClassPathXmlApplicationContext("config_development.xml","config_production.xml","config.xml");
		System.out.println("--- Loading Completed ----------");
		for (String name : context.getBeanDefinitionNames())
			System.out.println(name);
		System.out.println("--- List Bean Names  Completed ----------");

	}

}
