package com.jarental.app.exceptions.user;

public class UserAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public UserAlreadyExistsException(String errorMessage){
		super(errorMessage);
	}

}
