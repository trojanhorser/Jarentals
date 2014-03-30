package com.jarentals.app.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public User addUser(User user) {
		
		User foundUser = userRepository.findUserByEmail(user.getEmail());
		
		//If user is not found save the new user
		if(foundUser == null){
			 user = userRepository.save(user);
		}else{
			//Otherwise return the found user
			user = foundUser;
		}
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

	@Override
	public User getUserByFbId(String fbid) {
		User user = userRepository.findUserByFbId(fbid);
		return user;
	}
}