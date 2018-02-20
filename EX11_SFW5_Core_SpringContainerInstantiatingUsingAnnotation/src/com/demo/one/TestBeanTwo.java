package com.demo.one;

import org.springframework.stereotype.Component;

@Component
public class TestBeanTwo {
	
	private String dataOne;

	public String getDataOne() {
		return dataOne;
	}

	public void setDataOne(String dataOne) {
		this.dataOne = dataOne;
	}

}
