package com.jarentals.app.test.UserController;

import static org.junit.Assert.assertEquals;
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
	private ResponseEntity<User> badHttpResponse;
		
	@Before
	public void setUp(){
		 MockitoAnnotations.initMocks(this);
		 goodHttpResponse = new ResponseEntity<User>(user,HttpStatus.OK);
		 badHttpResponse = new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		 userId = new Long(1);
	}
	
	@Test
	public void testgetUserById_Should_Return_400_Response_When_User_Is_Not_Found(){
	    UserController userController = new UserController(userService);
		when(userService.getUserById(userId)).thenReturn(null);
		ResponseEntity<User> response = userController.getUserByid(userId);
		assertEquals(response.getStatusCode(),badHttpResponse.getStatusCode());
	}
}
