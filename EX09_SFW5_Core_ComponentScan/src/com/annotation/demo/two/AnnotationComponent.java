package com.annotation.demo.two;

import org.springframework.stereotype.Component;

@Component("comp")
public class AnnotationComponent {

	public AnnotationComponent() {
		System.out.println("Annotation Componenet");
	}
	
	public void printEquipment() {
		System.out.println("Annotation Component Print");
	}

}
