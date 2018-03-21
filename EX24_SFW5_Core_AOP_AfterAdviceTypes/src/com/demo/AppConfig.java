package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.ShapeService;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("-------- Loading Completed ------------");

		ShapeService shapeService = context.getBean("shapeBean", ShapeService.class);
		shapeService.getCircle().getName();
		shapeService.getTriangle().getName();
		shapeService.getTriangle().setName("sdsfhk");
		shapeService.getTriangle().setAddress("Street");
		
		shapeService.getTriangle().setAge("20");
		
	}

}
