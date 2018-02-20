package com.demo.four;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.four.ConfigurationBuild;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBuild.class);
		System.out.println("--- Loading Completed ----------");
		for (String name : context.getBeanDefinitionNames())
			System.out.println(name);
		System.out.println("--- List Bean Names  Completed ----------");
		
		TestBeanOne firstBean = (TestBeanOne)context.getBean("foo");
		System.out.println(firstBean);
		
		TestBeanOne secondBean = (TestBeanOne)context.getBean("foo1"); // Alias Name Calling
		System.out.println(secondBean);

	}

}
