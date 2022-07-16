package com.apptech.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class startjob {
@GetMapping("/start")

public String get() {
	
	return "start";
}
}
