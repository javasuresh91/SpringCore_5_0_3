package com.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String getName())") 
	public void loggingAdviceOne() {
		System.out.println("Advice Running by the Method Signature in full project");
	}

	@Before("execution(public String com.demo.model.Triangle.getName())") 
	public void loggingAdviceTwo() {
		System.out.println("Advice Running by the particular Method in the Class/Package");
	}
}
