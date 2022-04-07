package com.example.LoginForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
	
	@RequestMapping("/")
	public String home() {
		
		return "index.html";
	}
	@RequestMapping("/login")
	public String login() {
		
		return "login.html";
	}
	@RequestMapping(value={"/logout","/logout-success"})
	public String logout() {
		
		return "login.html";
	}
	
	

}
