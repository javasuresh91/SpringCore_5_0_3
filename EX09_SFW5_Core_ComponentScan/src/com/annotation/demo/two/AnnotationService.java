package com.annotation.demo.two;

import org.springframework.stereotype.Service;

@Service("serv")
public class AnnotationService {

	public AnnotationService() {
		System.out.println("Annotation Service");
	}
	
	public void printEquipment() {
		System.out.println("Annotation Service Print");
	}

}
