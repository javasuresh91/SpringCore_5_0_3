package com.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 
 * All the advice will execute when the point get satisfied
 *
 */
@Aspect
public class LoggingAspect {
	
	/**
	 * This advice is called before the target method called
	 */
	@Before("execution(public String com.demo.model.Circle.getName())") /** This signature tells the spring container to run the method whereever it see the 'public String getName()' */
	public void loggingAdvice() {
		System.out.println("This advice is called Before the Target Method Called");
	}
	
	/**
	 * This advice is called after the Target method called neither it runs or not runs successfully 
	 */
	@After("within(com.demo.model.Circle)")
	public void loggingAdviceTwo() {
		System.out.println("This advice is called after the Target Method Called");
	}
	/**
	 * This advice is called when the target method contain String as a argument and runs successfully
	 */
	@AfterReturning("args(String)")
	public void loggingAdviceThree() {
		System.out.println("This advice is called when the method returned the value successfully");
	}
	
	/**
	 * This advice is called when the target method contain String as a argument,return the value in specific type and runs successfully 
	 * @param inputParam
	 * @param returnValue
	 */
	@AfterReturning(pointcut="args(inputParam)",returning="returnValue") // All parameterd are optional
	public void loggingAdviceFive(String inputParam,String returnValue) {
		System.out.println("This advice is called to get the Return type Value : "+returnValue);
	}

	/**
	 * This advice is called when the target method throws Exception
	 */
	@AfterThrowing("args(String)")
	public void loggingAdviceFour() {
		System.out.println("This advice is called when the method throw exception");
	}
	
	
	@AfterThrowing(pointcut="args(inputValue)",throwing="ex") // All parameterd are optional
	public void loggingAdviceSix(String inputValue,Exception ex) {
		System.out.println("This advice is called when the method throw exception :"+ex);
	}
}
