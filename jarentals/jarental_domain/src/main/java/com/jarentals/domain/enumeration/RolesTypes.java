package com.jarentals.domain.enumeration;

public enum RolesTypes {
	ADMIN(200,"The admin user has all privilegdes"),
	USER(201,"Has the privilede to perform CRUD on user and place");
	
	private final int roleId;

	private final String description;
	
	private RolesTypes(int roleId,String description){
		this.roleId = roleId;
		this.description = description;
	}
	
	public int intValue(){
		return roleId;
	}
	
	public String getDescription(){
		return description;
	}
}
