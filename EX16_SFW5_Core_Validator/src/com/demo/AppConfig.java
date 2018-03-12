package com.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("---------- Loading Complted -------------");

		Person p = (Person) context.getBean("person");
		PersonValidator pv = (PersonValidator) context.getBean("personValid");
		Map<String, String> map = new HashMap<String, String>();
		MapBindingResult errorResult = new MapBindingResult(map, Person.class.getName());
		pv.validate(p, errorResult);
		List<ObjectError> list = errorResult.getAllErrors();
		for (ObjectError objErr : list) {
			System.out.println(objErr.getDefaultMessage());
		}

	}

}
