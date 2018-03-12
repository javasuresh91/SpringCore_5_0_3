package com.demo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Configuration.class);
		context.refresh();
		TestBeanOne beanOne = (TestBeanOne) context.getBean("testBeanOne");
		System.out.println(beanOne.getDataOne());

	}

}
