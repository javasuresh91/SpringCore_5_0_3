package com.annotation.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotationConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation_Config.xml");
		System.out.println(context);
		
	}
}
