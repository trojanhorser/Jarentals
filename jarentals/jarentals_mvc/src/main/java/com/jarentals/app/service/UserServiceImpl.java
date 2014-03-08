package com.jarentals.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jarentals.domain.model.User;
import com.jarentals.domain.repository.UserRepository;

public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
		
	public User addUser(User user){
		userRepository.save(user);
		return user;
	}
	
	public User getUser(Long id){
		User user = userRepository.findOne(id);
		return user;
	}
	
	@Autowired
	public void setRepo(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}