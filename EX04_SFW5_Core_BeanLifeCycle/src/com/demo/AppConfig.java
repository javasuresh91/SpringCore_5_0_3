package com.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("------------Laoding completed---------------");

		CallBackBeanOne beanOne = (CallBackBeanOne) context.getBean("callBackByPredefinedMethods");
		System.out.println("Data : " + beanOne.getDataOne());

		CallBackBeanTwo beanTwo = (CallBackBeanTwo) context.getBean("callBackByXmlConfig");
		System.out.println("Data : " + beanTwo.getDataOne());

		CallBackBeanThree beanThree = (CallBackBeanThree) context.getBean("callBackByDefaultMethod");
		System.out.println("Data : " + beanThree.getDataOne());

		context.close();
		
		/**
		 * so ensures a graceful shutdown and calls the relevant destroy methods on your
		 * singleton beans so that all resources are released
		 */
		context.registerShutdownHook();

	}
}
