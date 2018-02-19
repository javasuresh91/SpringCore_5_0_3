package com.xml.demo.two;

import org.springframework.stereotype.Component;

@Component("comp")
public class XMLComponent {

	public XMLComponent() {
		System.out.println("XML Componenet");
	}
	
	public void printEquipment() {
		System.out.println("XML Component Print");
	}

}
