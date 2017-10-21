package com.labs.demoapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.labs.demoapp.service.UsersService;

@Controller
public class WelcomeController {

	private final UsersService usersService;
	private String title = "Welcome";
	
	@Autowired
	public WelcomeController(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping(value = {"/"})
	public String welcome(Model model) {
		model.addAttribute("users", usersService.getUsers());
		model.addAttribute("title", title);
		return "welcome";
	}
	
}
