package com.jarentals.app.service;

import com.jarentals.domain.model.User;
import com.jarentals.domain.repository.UserRepository;

public interface UserService {
	public User addUser(User user);	
	public User getUser(Long id);
	public void setRepo(UserRepository userRepository);
}