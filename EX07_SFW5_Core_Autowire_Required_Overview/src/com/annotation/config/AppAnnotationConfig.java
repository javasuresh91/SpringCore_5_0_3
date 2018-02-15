package com.annotation.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotationConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation_Config.xml");
		System.out.println("---------Loading---------------");
		for (String name : context.getBeanDefinitionNames()) {
			System.out.print(name + "\t");
			System.out.println(context.getType(name));
		}

		MovieFinder beanOne = (MovieFinder) context.getBean("withoutRequired");
		System.out.println(beanOne.getMovieName());

		SimpleMovieLister beanTwo = (SimpleMovieLister) context.getBean("withRequired");
		System.out.println(beanTwo.getMovieName());

		Setter_Construtor_Autowire beanThree = (Setter_Construtor_Autowire) context.getBean("withAutowire");
		System.out.println("Value From Contructor Autowire : " + beanThree.getTestBeanOne().getDataOne());
		System.out.println("Value From Setter Autowire : " + beanThree.getTestBeanTw().getDataOne());
		System.out.println("Value From Primitive Type Autowire : " + beanThree.getName());
		System.out.println("Value From Custome Method Autowire : " + beanThree.getTestBeanThree().getDataOne());

		CollectionAutowire collectionAuto = (CollectionAutowire) context.getBean("collectionAutowire");
		System.out.println(collectionAuto.getSetOfMovieFinder());

	}
}
