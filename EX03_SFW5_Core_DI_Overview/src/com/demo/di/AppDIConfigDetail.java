package com.demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDIConfigDetail {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config_detail.xml");
		System.out.println(".....................Loading Completed..................");
		
		ExampleBean nameSpaceDIConfig= (ExampleBean)context.getBean("exampleBean");
		System.out.println("DI using namespace : "+nameSpaceDIConfig.getDataOne());
		
		ExampleBean propertyInjection = (ExampleBean) context.getBean("exampleBeanPropertyValue");
		System.out.println("DI Property Value : "+propertyInjection.getDataOne());
		
		ExampleBean propertyInjectionFromLocation = (ExampleBean) context.getBean("exampleBeanPropertyLocation");
		System.out.println("DI Property Value from File : "+propertyInjectionFromLocation.getDataOne());
		
		ExampleBeanOne idrefUseByPropertyAttribute = (ExampleBeanOne) context.getBean("idrefUseByPropertyAttribute");
		System.out.println("IdRef using Property Attribute : "+idrefUseByPropertyAttribute.getName());
		
		ExampleBeanTwo idrefUseByConstructorAttribute = (ExampleBeanTwo) context.getBean("idrefUseByConstructorAttribute");
		System.out.println("IdRef using Constructor Arg Attribute : "+idrefUseByConstructorAttribute.getName());
		
		ExampleBeanOne innerBeanUsedByPropertyAttribute = (ExampleBeanOne) context.getBean("innerBeanUsedByPropertyAttribute");
		System.out.println("Inner bean using Property Attribute : "+innerBeanUsedByPropertyAttribute.getBeanData().getDataOne());
		
		ExampleBeanOne dependsOn = (ExampleBeanOne)context.getBean("dependsOn");
		System.out.println("Depends On : "+dependsOn.getBeanData().getDataOne());
		
		LazyBean lazyBean =(LazyBean)context.getBean("lazy");
		System.out.println("Lazy Bean Called Now");
		System.out.println(lazyBean.getDataOne());
		

	}

}
