package com.jarentals.app.test.UserService;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.jarental.app.exceptions.user.UserAlreadyExistsException;
import com.jarentals.app.service.UserServiceImpl;
import com.jarentals.domain.model.User;
import com.jarentals.domain.repository.UserRepository;

public class UserServiceTest {
	
	@Mock
	private UserRepository userRepository;   
	private User user;
	
	private UserServiceImpl userService;	
	private Long userId; 
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		userService = new UserServiceImpl(userRepository);
		userId = new Long(1);
		user = new User();
		user.setEmail("email@jarentals.com");
	}
	
	@Test
	public void testAddUser_Must_Call_UserRepository_getUserByEmail_Method() {
		userService.addUser(user);
	    verify(userRepository).findUserByEmail(user.getEmail());
	}
	
	@Test
	public void testAddUser_Must_Call_UserRepository_Save_Method_When_User_Is_Not_Found() {
		when(userRepository.findUserByEmail(user.getEmail())).thenReturn(null);
		userService.addUser(user);
		verify(userRepository).save(user);
	}
	
	@Test
	public void testGetUserById_Must_Call_UserRepository_FindOne_Method(){
		userService.getUserById(userId);
	    verify(userRepository).findOne(userId);
	}
}
