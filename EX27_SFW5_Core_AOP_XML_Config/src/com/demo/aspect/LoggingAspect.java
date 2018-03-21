package com.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


public class LoggingAspect {
	
		public void loggingAdvice() {
		System.out.println("Get method Aspect Starts");
	}

}
