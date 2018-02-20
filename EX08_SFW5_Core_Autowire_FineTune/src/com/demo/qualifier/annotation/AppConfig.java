package com.demo.qualifier.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config_qualifier_two.xml");
		for (String name: context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		AutowireUsingQualifier beanOne = (AutowireUsingQualifier) context.getBean("autowireUsingQualifier");
		System.out.println("Qualifier mention bean value is executed : " + beanOne.getTestBeanOnee().getDataOne());

	}

}
