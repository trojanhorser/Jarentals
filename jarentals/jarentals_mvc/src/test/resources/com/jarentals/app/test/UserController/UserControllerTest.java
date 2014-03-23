package com.jarentals.app.test.UserController;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.jarentals.app.controller.user.UserController;
import com.jarentals.app.service.UserService;
import com.jarentals.domain.model.User;

public class UserControllerTest {
	
	@Mock
	private UserService userService;
	@Mock
	private User user;
	
	private UserController userController;
	private Long userId; 
	private ResponseEntity<User> goodHttpResponse;
	private ResponseEntity<User> notFoundHttpResponse;
	private ResponseEntity<User> badHttpResponse;
		
	@Before
	public void setUp(){
		 MockitoAnnotations.initMocks(this);
		 goodHttpResponse = new ResponseEntity<User>(user,HttpStatus.OK);
		 notFoundHttpResponse = new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		 badHttpResponse =  new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		 userId = new Long(1);
		 user = new User();
		 user.setEmail("someone@jarentals.com");
		 userController = new UserController(userService);
	}

	/*
	 * Tests for getUserById method
	 */
	@Test
	public void testGetUserById_Should_Return_400_Response_When_User_Is_Not_Found(){
		when(userService.getUserById(userId)).thenReturn(null);
		ResponseEntity<User> response = userController.getUserByid(userId);
		assertEquals(response.getStatusCode(),notFoundHttpResponse.getStatusCode());
	}
	
	@Test
	public void testGetUserById_Should_Return_200_Response_When_User_Is_Found(){
		when(userService.getUserById(userId)).thenReturn(user);
		ResponseEntity<User> response = userController.getUserByid(userId);
		assertEquals(response.getStatusCode(),goodHttpResponse.getStatusCode());
	}
	
	@Test
	public void testGetUserById_Should_Call_UserService_getUserById_Method(){
		userController.getUserByid(userId);
		verify(userService).getUserById(userId);	
	}
	
	/*
	 * Tests for addUser method
	 */
	@Test
	public void testAddUser_Should_Return_400_Response_When_User_Is_Not_Saved(){
		when(userService.addUser(user)).thenReturn(null);
		ResponseEntity<User> response = userController.addUser(user);
		assertEquals(response.getStatusCode(),badHttpResponse.getStatusCode());
	}
	
	@Test
	public void testAddUser_Should_Return_200_Response_When_User_Is_Successfullty_Saved(){
		when(userService.addUser(user)).thenReturn(user);
		ResponseEntity<User> response = userController.addUser(user);
		assertEquals(response.getStatusCode(),goodHttpResponse.getStatusCode());
	}
	
	@Test
	public void testAddUser_Should_Call_UserService_addUser_Method() {
		userController.addUser(user);
		verify(userService).addUser(user);	
	}
}