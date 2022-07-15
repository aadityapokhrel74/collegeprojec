package com.apptech.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.apptech.demo.model.User;
import com.apptech.demo.service.UserService;


@Controller
public class AyatController {
	@Autowired
	private UserService service;
	@GetMapping("/student")
	public String get() {
		return "studentForm";
	}
	@PostMapping("/student")
	public String saveUser(@ModelAttribute User user) {
		service.userSignup(user);
		
		 return "loginForm";
		
	}
	
	

}
