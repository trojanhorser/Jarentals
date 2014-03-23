package com.jarentals.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jarental.app.exceptions.messages.IExceptionMessages;
import com.jarental.app.exceptions.user.UserAlreadyExistsException;
import com.jarentals.domain.model.User;
import com.jarentals.domain.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	public UserServiceImpl() {
	}
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public User addUser(User user) throws UserAlreadyExistsException{
		
		User foundUser = userRepository.findUserByEmail(user.getEmail());
		
		if(foundUser != null){
			throw new UserAlreadyExistsException(IExceptionMessages.USER_ALREADY_EXIST);
		}
		
		 user = userRepository.save(user);
		
		return user;
	}
	
	public User getUserById(Long id){
		User user = userRepository.findOne(id);
		return user;
	}

	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User getUserByEmail(String email){
		User user = userRepository.findUserByEmail(email);
		return user;
	}
}