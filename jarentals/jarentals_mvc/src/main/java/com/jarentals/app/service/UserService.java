package com.jarentals.app.service;

import com.jarental.app.exceptions.user.UserAlreadyExistsException;
import com.jarentals.domain.model.User;

public interface UserService {
	public User addUser(User user) throws UserAlreadyExistsException;	
	public User getUserById(Long id);
	public User getUserByEmail(String email);
}