package com.demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDiScopes {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config_scope.xml");
		System.out.println("-------------------- Loading ------------------");
		
		ScopeBean scopeOne = (ScopeBean)context.getBean("singletonScopeBean");
		System.out.println("Singleton : "+scopeOne);
		
		ScopeBean scopeTwo = (ScopeBean)context.getBean("singletonScopeBean");
		System.out.println("Singleton : "+scopeTwo);
		
		ScopeBean scopeThree = (ScopeBean)context.getBean("prototypeScopeBean");
		System.out.println("Prototype : "+scopeThree);
		
		ScopeBean scopeFour = (ScopeBean)context.getBean("prototypeScopeBean");
		System.out.println("Prototype : "+scopeFour);

	}

}
