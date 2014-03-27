package com.jarentals.app.controller.user;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarental.app.exceptions.user.UserAlreadyExistsException;
import com.jarentals.app.service.UserService;
import com.jarentals.common.util.Util;
import com.jarentals.domain.enumeration.RolesTypes;
import com.jarentals.domain.enumeration.UserStatusTypes;
import com.jarentals.domain.model.User;



@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	private UserService userService;
	
	public UserController() {
	}
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/user/{id}",method = RequestMethod.GET, produces={"application/json"})
	public @ResponseBody ResponseEntity<User> getUserByid(@PathVariable("id") Long id) {
		logger.info("getUserByid");
		User user = null;
		user = userService.getUserById(id);
		if(user!=null){
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}else{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/user",method = RequestMethod.POST, produces={"application/json"})
	public ResponseEntity<User> addUser(@RequestBody User user) {
		logger.info("user "+ user.getUsername());
		
		user.setRoleId(RolesTypes.USER.intValue());
		user.setUserStatusId(UserStatusTypes.ACTIVE.intValue());
		user.setCreatedWhen(Calendar.getInstance().getTime());
		user.setUpdatedWhen(Calendar.getInstance().getTime());
		User newUser = userService.addUser(user);
		
		if(newUser!=null){
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}else{
			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}
	}	
	
	@RequestMapping(value = "/user/facebook/{facebookId}",method = RequestMethod.GET, produces={"application/json"})
	public @ResponseBody ResponseEntity<User> getUserByFacebookId(@PathVariable("facebookId") String facebookId) {
		logger.info("getUserByFscebookId");
		logger.info(facebookId);
		User user = null;
		user = userService.getUserByFbId(facebookId);
		if(user!=null){
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}else{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/user/email/{email}",method = RequestMethod.GET, produces={"application/json"})
	public @ResponseBody ResponseEntity<User> getUserByEmail(@PathVariable("email") String email) {
		logger.info("getUserByEmail");
		User user = null;
		user = userService.getUserByEmail(email);
		if(user!=null){
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}else{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}