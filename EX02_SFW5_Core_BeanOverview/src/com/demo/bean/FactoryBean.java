package com.demo.bean;

public class FactoryBean {
	
	private String dataOne;
	
	private FactoryBean() {}
	
	
	public static FactoryBean getStaticInstance() {
		System.out.println("Static Factory Method Called");
		return new FactoryBean();
	}
	public FactoryBean getNonStaticInstance() {
		System.out.println("Non-Static Factory Method Called");
		return new FactoryBean();
	}
	public String getDataOne() {
		return dataOne;
	}

	public void setDataOne(String dataOne) {
		this.dataOne = dataOne;
	}
	
	


}
