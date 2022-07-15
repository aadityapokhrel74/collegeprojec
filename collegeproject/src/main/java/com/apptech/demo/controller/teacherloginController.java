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
public class teacherloginController {
	@Autowired

	private TeacherService servicet;
	
	//@GetMapping("/teacher")
	//public String get() {
		//return "teacherlogin";
	//}
	
	@PostMapping("/teacherlogin")
	public String saveTeacher(@ModelAttribute Teacher teacher,Model model ) {
		Teacher tsr = servicet.log(teacher.getUsername(), teacher.getPassword());
		if(tsr!=null) {
		
			
		 model.addAttribute("message","You are a Student")	;	
		 return "teacherapply";
		}
		model.addAttribute("message","user not found");
		return "teacherlogin";
		
	}
		
 
		
	}



