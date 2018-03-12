package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Sample {

	public String dataOne;
	public List<String> dataList;
	public List<Person> personList;
	public Map<String,String> dataMap;
	
	public Sample() {
		personList = new ArrayList<>();
		Person p1= new Person();
		p1.setName("X");
		p1.setAge(20);
		getPersonList().add(p1);
		Person p2= new Person();
		p2.setName("Y");
		p2.setAge(0);
		getPersonList().add(p2);
	}

	public String getDataOne() {
		return dataOne;
	}

	public void setDataOne(String dataOne) {
		this.dataOne = dataOne;
	}

	public List<String> getDataList() {
		return dataList;
	}

	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public Map<String, String> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, String> dataMap) {
		this.dataMap = dataMap;
	}
	
	public String check(String data) {
		return data.equalsIgnoreCase("") ? "Empty" : "valid";
	}
	
	
}
