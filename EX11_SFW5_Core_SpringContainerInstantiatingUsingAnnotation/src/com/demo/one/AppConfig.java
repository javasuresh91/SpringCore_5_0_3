package com.demo.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBuild.class);
		System.out.println("---------- Loading Completed -------------");
		TestBeanOne bean = (TestBeanOne)context.getBean("beanOne");
		System.out.println(bean.getDataOne());
		
		
		/**
		 * AnnotationConfigApplicationContext is not limited 
		 * to working only with @Configuration classes. 
		 * Any @Serive @Repositary @Component(use Spring dependency injection for @Autowired)
		 */
		ApplicationContext contextTwo = new AnnotationConfigApplicationContext(ConfigurationBuild.class,TestBeanTwo.class);
		System.out.println("---------- Second Loading Completed -------------");
		for(String name : contextTwo.getBeanDefinitionNames())
			System.out.println(name);

	}

}
