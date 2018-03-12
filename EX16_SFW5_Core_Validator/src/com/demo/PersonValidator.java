package com.demo;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {

	Resource resource;
	
	public Resource getResource() {
		return resource;
	}

	@Autowired
	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	public boolean supports(Class<?> arg0) {
		System.out.println("Support Method");
		return Person.class.equals(arg0);
	}

	@Override
	public void validate(Object ob, Errors err) {
		System.out.println("Validator Method");
		Properties props=null;
		try {
			 props = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String msg1 = props.getProperty("err.name");
		ValidationUtils.rejectIfEmpty(err, "name", "err.name",msg1);
		Person user = (Person)ob;
		if(user.getAge()<18){
			String msg2 = props.getProperty("errormsg.age");
			err.rejectValue("age","errormsg.age",msg2);
		}
		
	}
	
	

}
