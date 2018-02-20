package com.demo.two;

import org.springframework.stereotype.Component;

@Component
public class TestBeanThree {
	private String dataOne;

	public String getDataOne() {
		return dataOne;
	}

	public void setDataOne(String dataOne) {
		this.dataOne = dataOne;
	}
}
