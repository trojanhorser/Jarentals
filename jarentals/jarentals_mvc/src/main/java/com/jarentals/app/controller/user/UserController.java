package com.jarentals.app.controller.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarentals.app.service.UserServiceImpl;
import com.jarentals.domain.model.User;



@Controller
public class UserController {
	
private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	private UserServiceImpl userService;

	@RequestMapping(value = "/user/{id}",method = RequestMethod.GET, produces={"application/json"})
	public @ResponseBody ResponseEntity<User> getUser(@PathVariable("id") Long id) {
		User user = null;
		user = userService.getUser(id);
		if(user!=null){
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}else{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

	@Autowired
	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}	
}