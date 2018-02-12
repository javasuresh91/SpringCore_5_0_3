package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("------- Loading ----------");
		TestBean bean = (TestBean) context.getBean("inheritsWithSameClass");
		System.out.println(bean.getName());
		
		DerivedTestBean beanOne = (DerivedTestBean) context.getBean("inheritsWithDiffClass");
		System.out.println("Child value : "+beanOne.getName());
		System.out.println("Parent Value : "+beanOne.getAge());
				
	}

}
