package com.jarentals.domain.enumeration;

public enum UserStatusTypes {
	
	ACTIVE(600,"user is enabled"),
	INACTIVE(601,"user is disabled");
	
	private final int statusId;

	private final String description;
	
	private UserStatusTypes(int statusId,String description){
		this.statusId = statusId;
		this.description = description;
	}
	
	public int intValue(){
		return statusId;
	}
	
	public String getDescription(){
		return description;
	}
}
