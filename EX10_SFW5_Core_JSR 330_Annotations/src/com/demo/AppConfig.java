package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.jsr.TestBeanOne;
import com.demo.jsr.TestBeanTwo;

public class AppConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		System.out.println("---------- Loading Completed -----------");
		for(String name : context.getBeanDefinitionNames())
			System.out.println(name);
		System.out.println("---------- Listing Bean Name Completed -----------");
		TestBeanOne bean = (TestBeanOne)context.getBean("testBeanOne");
		System.out.println(bean.getTestBean().getDataOne());
		
		TestBeanTwo beanT = (TestBeanTwo )context.getBean("nameBeanTwo");
		System.out.println(beanT.getTestBean().getDataOne());
	}

}
