package com.apptech.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TeacherNameController {
@GetMapping("/teachername")
public String get() {
	return "teachername";
}
}
