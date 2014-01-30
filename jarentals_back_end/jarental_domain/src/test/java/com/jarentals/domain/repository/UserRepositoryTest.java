package com.jarentals.domain.repository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

import com.jarentals.domain.User;
import com.jarentals.domain.repository.UserRepository;

public class UserRepositoryTest {
	
	@Mock
	UserRepository userRepository;
	
	@Mock
	User user;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	

	//Must return a User Object when executed
	@Test 
	public void testAddUserReturnsAUserObject(){
	   when(userRepository.save(user)).thenReturn(user);
	}

}
