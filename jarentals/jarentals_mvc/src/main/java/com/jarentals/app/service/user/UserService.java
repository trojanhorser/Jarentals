package com.jarentals.app.service.user;

import com.jarentals.domain.model.User;

public interface UserService {
	public User addUser(User user);	
	public User getUserById(Long id);
	public User getUserByEmail(String email);
	public User getUserByFbId(String fbid);
}