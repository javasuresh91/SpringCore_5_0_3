package com.demo.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBeanOne {
	
	@Value("${demo}")
	private String dataOne;

	public String getDataOne() {
		return dataOne;
	}

	public void setDataOne(String dataOne) {
		this.dataOne = dataOne;
	}
	
	
	
	

}
