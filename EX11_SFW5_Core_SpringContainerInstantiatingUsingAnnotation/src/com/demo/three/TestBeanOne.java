package com.demo.three;

import org.springframework.stereotype.Component;

@Component
public class TestBeanOne {
	
	private String dataOne;

	public String getDataOne() {
		return dataOne;
	}

	public void setDataOne(String dataOne) {
		this.dataOne = dataOne;
	}

}
