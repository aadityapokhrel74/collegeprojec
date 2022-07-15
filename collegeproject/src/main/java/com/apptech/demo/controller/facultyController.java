package com.apptech.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class facultyController {
	@GetMapping("/yearly")
	public String get() {
		
		return "yearly";
	}
	

}
