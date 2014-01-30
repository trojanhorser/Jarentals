package com.jarentals.domain.service.user;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jarentals.common.util.Util;
import com.jarentals.domain.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private SessionFactory session;
	
	public void addUser(User user) {
		
		if(Util.isObjectEmpty(user)){
			throw new IllegalArgumentException();
		}
	}

}
