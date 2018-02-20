package com.demo.primary.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config_primary_two.xml");
		for (String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		TestBeanOne beanOne = (TestBeanOne) context.getBean("testBeanFirst");
		System.out.println("Primary Annotation bean value is executed : " + beanOne.getDataOne());

	}

}
