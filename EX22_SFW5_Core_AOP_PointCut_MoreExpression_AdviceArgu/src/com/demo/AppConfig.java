package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.ShapeService;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("-------- Loading Completed ------------");
//		for (String beanName : context.getBeanDefinitionNames()) {
//			System.out.println(beanName);
//		}
		ShapeService shapeService = context.getBean("shapeBean", ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
		System.out.println(shapeService.getTriangle().getName());
		shapeService.getTriangle().setName("Dummuy");

	}

}
