package com.apptech.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class alreadyController {
 @GetMapping("/already")
 public String get() {
	 return "teacherlogin";
 }
}
