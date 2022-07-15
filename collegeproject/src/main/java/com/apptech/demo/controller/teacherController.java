package com.apptech.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class teacherController {
	@GetMapping("/internal")
	public String get() {
		
		return "internal";
	}
	

}
