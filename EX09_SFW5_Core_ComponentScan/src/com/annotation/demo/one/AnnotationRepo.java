package com.annotation.demo.one;

import org.springframework.stereotype.Repository;

@Repository("repo")
public class AnnotationRepo {
	
	public AnnotationRepo() {
		System.out.println("Annotation Repo");
	}
	
	public void printEquipment() {
		System.out.println("Annotation Repo Print");
	}

}
