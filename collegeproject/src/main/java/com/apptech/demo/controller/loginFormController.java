package com.apptech.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.apptech.demo.model.Teacher;
import com.apptech.demo.model.User;
import com.apptech.demo.service.TeacherService;
import com.apptech.demo.service.UserService;


@Controller
public class loginFormController {
	@Autowired
	private UserService service;
	private TeacherService servicet;
	
	@GetMapping("/login")
	public String get() {
		return "loginForm";
	}
	@PostMapping("/login")
	public String saveUser(@ModelAttribute User user,Model model ) {
		User usr = service.login(user.getUsername(), user.getPassword());
		if(usr!=null) {
			
		 model.addAttribute("message","You are a Student")	;	
		 return "College";
		}
		model.addAttribute("message","user not found");
		return "loginForm";
		
	}
	
		
 
		
	}



