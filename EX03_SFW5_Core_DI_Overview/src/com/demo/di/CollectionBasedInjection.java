package com.demo.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBasedInjection {

	private Properties emailDetails;

	private List<Object> listObject;
	private Map<String, Object> mapObject;
	private Set<Object> setObject;

	public Properties getEmailDetails() {
		return emailDetails;
	}

	public void setEmailDetails(Properties emailDetails) {
		this.emailDetails = emailDetails;
	}

	public List<Object> getListObject() {
		return listObject;
	}

	public void setListObject(List<Object> listObject) {
		this.listObject = listObject;
	}

	public Map<String, Object> getMapObject() {
		return mapObject;
	}

	public void setMapObject(Map<String, Object> mapObject) {
		this.mapObject = mapObject;
	}

	public Set<Object> getSetObject() {
		return setObject;
	}

	public void setSetObject(Set<Object> setObject) {
		this.setObject = setObject;
	}

}
