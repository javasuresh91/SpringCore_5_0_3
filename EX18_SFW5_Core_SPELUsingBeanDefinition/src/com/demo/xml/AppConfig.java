package com.demo.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		TestBeanOne beanOne = (TestBeanOne) context.getBean("beanOne");
		System.out.println("String Value : " +beanOne.getDataOne());
		System.out.println("Integer Value : " +beanOne.getRandomNumber());
		System.out.println("Loaded from Property File : " +beanOne.getDataTwo());
		TestBeanTwo beanTwo = (TestBeanTwo) context.getBean("beanTwo");
		System.out.println("Reference Bean Value : "+beanTwo.getRanNumber());	
		
	}

}
