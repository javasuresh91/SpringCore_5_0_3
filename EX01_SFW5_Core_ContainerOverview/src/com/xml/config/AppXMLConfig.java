package com.xml.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXMLConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DI_config.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p.getContact().getDoorNo());
	}
}
