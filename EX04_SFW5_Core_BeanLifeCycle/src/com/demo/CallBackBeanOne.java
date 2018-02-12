package com.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/**
 * 
 * @author SR00492780
 * Implementing Interface	
 */
public class CallBackBeanOne implements InitializingBean ,DisposableBean  {
	
	private String dataOne;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialized by InitializingBean");
		this.dataOne = "Initialized";		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("End up by DisposableBean");
		this.dataOne = null;
		
	}

	public String getDataOne() {
		return dataOne;
	}

	public void setDataOne(String dataOne) {
		this.dataOne = dataOne;
	}
	
	
	

}
