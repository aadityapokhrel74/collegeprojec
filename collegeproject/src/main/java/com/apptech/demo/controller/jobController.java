package com.apptech.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class jobController {
	@GetMapping("/job")
	public String get() {
		
		return "jobApply";
	}
	

}

