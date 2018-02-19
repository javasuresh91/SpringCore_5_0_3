package com.xml.demo.one;

import org.springframework.stereotype.Repository;

@Repository("repo")
public class XMLRepo {
	
	public XMLRepo() {
		System.out.println("XML Repo");
	}
	
	public void printEquipment() {
		System.out.println("XML Repo Print");
	}

}
