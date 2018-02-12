package com.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Using Annotation
 * @author SR00492780
 *
 */
public class CallBackBeanThree {

	private String dataOne;

	@PostConstruct
	public void initPost() {
		System.out.println("Initialized by Default method namespace");
		this.dataOne = "Initialized";
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("End up by Default method namespace");
		this.dataOne = null;
	}

	public String getDataOne() {
		return dataOne;
	}

	public void setDataOne(String dataOne) {
		this.dataOne = dataOne;
	}

}
