package com.xml.demo.two;

import org.springframework.stereotype.Service;

@Service("serv")
public class XMLService {

	public XMLService() {
		System.out.println("XML Service");
	}
	
	public void printEquipment() {
		System.out.println("XML Service Print");
	}

}
