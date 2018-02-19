package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xml.demo.one.XMLRepo;
import com.xml.demo.two.XMLComponent;
import com.xml.demo.two.XMLService;

public class AppConfigXML {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("------------Loading completed-----------");
		for (String name : context.getBeanDefinitionNames())
			System.out.println(name);
		System.out.println("--- List of bean Completd----");
		XMLService serviceBean = (XMLService) context.getBean("serv");
		serviceBean.printEquipment();
		XMLRepo repoBean = (XMLRepo) context.getBean("repo");
		repoBean.printEquipment();
		XMLComponent compBean = (XMLComponent) context.getBean("comp");
		compBean.printEquipment();
	}

}
