package com.apptech.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.apptech.demo.model.Teacher;
import com.apptech.demo.model.User;
import com.apptech.demo.service.TeacherService;
import com.apptech.demo.service.UserService;



@Controller
public class teacherFormController {
	@Autowired
	private TeacherService servicet;
	
	@GetMapping("/teacher")
	public String get() {
		return "teacherForm";
	}
	@PostMapping("/teacher")
	public String saveUser(@ModelAttribute Teacher teacher) {
 
		servicet.teacherSignup(teacher);
		 return "teacherlogin";
		
	}
	
	

}
