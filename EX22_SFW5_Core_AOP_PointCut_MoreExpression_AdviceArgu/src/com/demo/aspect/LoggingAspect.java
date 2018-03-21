package com.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	/**
	 * Execute all methods in the Class/Package - Type1
	 */
	@Before("execution( * com.demo.*.Triangle.*(..))") 
	public void loggingAdvice() {
		System.out.println("Get method Aspect Starts -Type One");
	}

	/**
	 * Execute all method in the class/package - Type2
	 * For Sub Package we need to denoted as '..'(within(com.demo..*))
	 */
	@Before("within(com.demo.*.Triangle)")
	public void loggingAdviceOne() {
		System.out.println("Get method Aspect Starts -Type two");
	}
	
	@Before("args(String)")
	public void loggingAdviceTwo() {
		System.out.println("Set method Aspect Starts -Type three");
	}
	
	@Before("args(a)")
	public void loggingAdviceThree(String a) {
		System.out.println("Set method Aspect Starts(getting The Param Vaslue) -Type Four : "+a);
	}
}
