package com.annotation.config;

import org.springframework.beans.factory.annotation.Autowired;

public class Setter_Construtor_Autowire {

	private TestBeanOne testBeanOne;
	private TestBeanTwo testBeanTw;
	private String name;
	private TestBeanThree testBeanThree;

	@Autowired
	public void setCustomMethod(TestBeanThree testBeanThree) {
		this.testBeanThree = testBeanThree;
	}

	@Autowired
	public Setter_Construtor_Autowire(TestBeanOne testBeanOne) {
		System.out.println("Constructor Autowring");
		this.testBeanOne = testBeanOne;
	}

	public TestBeanTwo getTestBeanTw() {
		return testBeanTw;
	}

	@Autowired
	public void setTestBeanTw(TestBeanTwo testBeanTw) {
		this.testBeanTw = testBeanTw;
	}

	public TestBeanThree getTestBeanThree() {
		return testBeanThree;
	}

	public TestBeanOne getTestBeanOne() {
		return testBeanOne;
	}

	public String getName() {
		return name;
	}

	@Autowired
	public void setName(String name) {
		this.name = name;
	}

}
