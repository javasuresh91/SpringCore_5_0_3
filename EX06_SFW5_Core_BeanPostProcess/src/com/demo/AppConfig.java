package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("------------- :Loading --------------");
		BeanOne bean = (BeanOne) context.getBean("beanProcessOne");
		System.out.println("Bean Value : " + bean.getName());
	}

}
