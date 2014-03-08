package com.jarentals.app.service;

import com.jarentals.domain.model.User;

public interface UserService {
	public User addUser(User user);	
	public User getUser(Long id);
}