package com.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	
		
	@Around("execution(* com.demo.model.Circle.get*())")
	public Object loggingAdviceOne(ProceedingJoinPoint proceedingJoinPoint) {
		Object obj = null;
		try {
			System.out.println("Around advice called before target called");
			obj = proceedingJoinPoint.proceed();
			System.out.println("Around advice called After target called");
		} catch (Throwable e) {
			System.out.println("Around advice Exception");
		}
		return obj;
	}

}
