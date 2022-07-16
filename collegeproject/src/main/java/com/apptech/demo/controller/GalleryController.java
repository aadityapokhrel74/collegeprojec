package com.apptech.demo.controller;

import java.io.File;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class GalleryController {
@GetMapping("/gallery")
public String gallery(Model model) {
	File folder = new File("src/main/resources/static/images");
	String[] imageNames = folder.list();
	model.addAttribute("imgNames",imageNames);
	return "galleryForm";
}
}