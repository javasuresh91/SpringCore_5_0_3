package com.demo;

/**
 * Using XMl Config
 * @author SR00492780
 *
 */
public class CallBackBeanTwo   {
	
	private String dataOne;

	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialized by XML Config");
		this.dataOne = "Initialized";		
	}

	
	public void destroy() throws Exception {
		System.out.println("End up by XML Config");
		this.dataOne = null;
		
	}

	public String getDataOne() {
		return dataOne;
	}

	public void setDataOne(String dataOne) {
		this.dataOne = dataOne;
	}
	
	
	

}
