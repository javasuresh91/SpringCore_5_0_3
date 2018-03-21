package com.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("@annotation(com.demo.aspect.Loggable)") 
	public void loggingAdvice() {
		System.out.println("Get method Aspect Starts Using Custom Annotation");
	}

}
