package com.demo.two;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * using register in Aplication Context
 * @author SR00492780
 *
 */
public class AppConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigurationBuildOne.class);
		context.register(ConfigurationBuildTwo.class,TestBeanThree.class);
		context.refresh();
		System.out.println("--- Loading Completed ----------");
		for(String name : context.getBeanDefinitionNames())
			System.out.println(name);
		System.out.println("--- List Bean Names  Completed ----------");
		
		TestBeanOne beanOne = (TestBeanOne) context.getBean("getBeanOne");
		System.out.println(beanOne.getDataOne());

		TestBeanTwo beanTwo = (TestBeanTwo) context.getBean("getBeanTwo");
		System.out.println(beanTwo.getDataOne());
	}

}
