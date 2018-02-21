package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");

		String a = context.getMessage("secord.prop", null, null);
		System.out.println(a);
		
		/*Palcing Value as Parameter*/
		String b = context.getMessage("first.prop", new Object [] {"Suresh"}, null, null);
		System.out.println(b);
	}

}
