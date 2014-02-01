package com.jarentals.app.controller.user;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jarentals.app.HomeController;
import com.jarentals.domain.User;
import com.jarentals.domain.service.user.UserServiceImpl;
import com.jarentals.test.SimpleUserRepository;

@Controller
public class UserController {
private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private SimpleUserRepository repo;
	public SimpleUserRepository getRepo() {
		return repo;
	}
	public void setRepo(SimpleUserRepository repo) {
		this.repo = repo;
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		repo.findAll();
		
		return "home";
	}
}
