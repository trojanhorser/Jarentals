package com.jarentals.domain.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jarentals.common.util.Util;
import com.jarentals.domain.User;
import com.jarentals.domain.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public void addUser(User user) {
		
		if(Util.isObjectEmpty(user)){
			throw new IllegalArgumentException();
			
		}
		userRepository.save(user);
	}

}
