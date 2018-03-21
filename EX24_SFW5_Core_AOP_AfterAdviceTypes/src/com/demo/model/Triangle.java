package com.demo.model;

public class Triangle {
	
	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Triangle Name Setter  Called");
		this.name = name;		
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		System.out.println("Triangle Age Setter  Called");
		this.age = age;
		throw new ArithmeticException();
		
	}
	
	public String setAddress(String address) {
		System.out.println("Triangle Address Setter  Called ");
		return address;
		
	}
	
	
	

}
