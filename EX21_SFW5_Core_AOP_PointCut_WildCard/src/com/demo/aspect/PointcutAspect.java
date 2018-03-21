package com.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 
 * To avoid the same point to repeat in multiple Advice, we can go to the @PointCut
 *
 */
@Aspect
public class PointcutAspect {
	
	@Pointcut("execution(public * get*())")
	public void allGetter() {
		
	}
	
	@Pointcut("execution(public * com.demo.model.Circle.get*())")
	public void allCricleGetter() {
		
	}
	
	@Before("allGetter()")
	public void pointCutOne() {
		System.out.println("First Advice using Pointcut");
	}
	
	@Before("allGetter()")
	public void pointCutTwo() {
		System.out.println("Second Advice using Pointcut");
	}
	
	@Before("allGetter() && allCricleGetter()")
	public void pointCutThree() {
		System.out.println("Third Advice using Pointcut");
	}

}
