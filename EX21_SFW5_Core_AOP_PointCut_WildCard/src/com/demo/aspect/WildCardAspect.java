package com.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
/**
 * 
 * N no of Arguments - @Before("execution(* get*(*))")
 * With or without arguments - @Before("execution(* get*(..))")
 */
@Aspect
public class WildCardAspect {

	/**
	 * This will execute for all the getters in the Project
	 * We used Wildcard in the Return Type and name of the method
	 */
	@Before("execution(public * get*())") 
	public void loggingOne() {
		System.out.println("Aspect using Wildcard");
	}
	
	@Before("execution(* get*())") 
	public void loggingTwo() {
		System.out.println("Aspect using Wildcard for any specific Accessfier");
	}

}
