package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotation.demo.two.AnnotationComponent;
import com.annotation.demo.two.AnnotationService;

public class AppConfigAnnotation {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		for (String name : context.getBeanDefinitionNames())
			System.out.println(name);
		AnnotationComponent compBean = (AnnotationComponent) context.getBean("comp");
		compBean.printEquipment();
		AnnotationService servBean = (AnnotationService) context.getBean("serv");
		servBean.printEquipment();

	}

}
