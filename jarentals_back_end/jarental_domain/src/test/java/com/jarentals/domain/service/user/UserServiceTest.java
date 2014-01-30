package com.jarentals.domain.service.user;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.jarentals.domain.User;
import com.jarentals.domain.repository.UserRepository;
import com.jarentals.domain.service.user.UserService;
import com.jarentals.domain.service.user.UserServiceImpl;

public class UserServiceTest {
	
	@Mock 
	UserRepository userRepository;
	
	@Mock
	User user;
	
	private UserService userService;
	
	
	@Before
	public void setUp(){
		
		MockitoAnnotations.initMocks(this);
		userService = new UserServiceImpl();
	}
	
	//Should throw illegal argument exception when null values are passed
	@Test(expected=IllegalArgumentException.class)
	public void testShouldThrowIllegalArgumentExceptionWhenUserParamtersIsNull(){
		userService.addUser(null);
	}
	
}
