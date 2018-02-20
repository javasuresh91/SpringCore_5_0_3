package com.demo.qualifier.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config_quantifier.xml");
		AutowireUsingQualifier beanOne = (AutowireUsingQualifier) context.getBean("usingQualifierOne");
		System.out.println("Qualifier mention bean value is executed using XML : " + beanOne.getTestBeanOnee().getDataOne());

	}

}
