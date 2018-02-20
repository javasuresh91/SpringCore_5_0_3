package com.demo.primary.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config_primary.xml");
		AutowireUsingPrimary beanOne = (AutowireUsingPrimary) context.getBean("usingPrimaryOne");
		System.out.println("Primary mention bean value is executed : " + beanOne.getTestBeanOnee().getDataOne());

	}

}
