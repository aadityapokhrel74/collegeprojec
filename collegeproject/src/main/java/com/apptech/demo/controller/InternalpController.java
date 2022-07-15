package com.apptech.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InternalpController {
	@GetMapping("/internalp")
	public String get() {
	
	return "internalp";
		
	}
		

	}


