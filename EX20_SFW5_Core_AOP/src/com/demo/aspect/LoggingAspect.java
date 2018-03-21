package com.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String getName())") /** This signature tells the spring container to run the method whereever it see the 'public String getName()' */
	public void loggingAdvice() {
		System.out.println("Get method Aspect Starts");
	}

}
