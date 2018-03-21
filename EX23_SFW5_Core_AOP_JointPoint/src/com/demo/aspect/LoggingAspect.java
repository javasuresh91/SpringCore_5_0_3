package com.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("within(com.demo.model.Circle)") 
	public void loggingAdvice(JoinPoint joinpoint) {
		System.out.println("Get method Aspect Starts : "+joinpoint.toString() );
		System.out.println("Target Object : "+joinpoint.getTarget());
	}

}
