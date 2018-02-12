package com.demo.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBeanConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println(".....................Loading Completed..................");
		
		ExampleBean example= (ExampleBean) context.getBean("example");
		System.out.println("Constructor Bean Insitate: " +example.getDataOne());
		
		FactoryBean factoryBean = (FactoryBean)context.getBean("factoryBeanOne");
		System.out.println("Default factory Bean : "+factoryBean.getDataOne());
		
		
		FactoryBean factoryBeanTwo = (FactoryBean)context.getBean("factoryBeanTwo");
		System.out.println("Insitate static factory Method : "+factoryBeanTwo.getDataOne());
		
		
		FactoryBean factoryBeanThree = (FactoryBean)context.getBean("factoryBeanThree");
		System.out.println("Insitate non-static factory Method : "+factoryBeanThree.getDataOne());
		
	}
}
