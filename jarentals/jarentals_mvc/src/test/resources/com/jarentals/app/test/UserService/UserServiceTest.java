package com.jarentals.app.test.UserService;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.jarentals.app.service.UserServiceImpl;
import com.jarentals.domain.model.User;
import com.jarentals.domain.repository.UserRepository;

public class UserServiceTest {
	
	@Mock
	private UserRepository userRepository;   
	@Mock
	private User user;
	
	private UserServiceImpl userService;	
	private Long userId; 
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		userId = new Long(1);
	}
	
	@Test
	public void testAddUser_Must_Call_UserRepository_Save_Method(){
		userService = new UserServiceImpl(userRepository);
		userService.addUser(user);
	    verify(userRepository).save(user);
	}
	
	@Test
	public void testGetUserById_Must_Call_UserRepository_FindOne_Method(){
		userService = new UserServiceImpl(userRepository);
		userService.getUserById(userId);
	    verify(userRepository).findOne(userId);
	}
}
