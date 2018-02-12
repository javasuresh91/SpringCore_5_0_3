package com.demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDIConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println(".....................Loading Completed..................");
		
		ConstructorBasedInjectionOne constructorOne = (ConstructorBasedInjectionOne)context.getBean("constructorInjectionOne");
		System.out.println("Primitive Constructor Injection : "+constructorOne.getDataOne());
		
		ConstructorBasedInjectionTwo constructorTwo = (ConstructorBasedInjectionTwo)context.getBean("constructorInjectionTwo");
		System.out.println("Class type Constructor Injection : "+constructorTwo.getExampleBean().getDataOne());
		
		ConstructorBasedInjectionThree constructorThree = (ConstructorBasedInjectionThree)context.getBean("constructorInjectionThree");
		System.out.println("Constructor Injection avoid ambiguation : "+constructorThree.getDataOne());
		
		SetterBasedInjection setterOne = (SetterBasedInjection)context.getBean("setterInjection");
		System.out.println("Setter Injection : "+setterOne.getExampleBean().getDataOne());
		
		
		
		
	}
}
