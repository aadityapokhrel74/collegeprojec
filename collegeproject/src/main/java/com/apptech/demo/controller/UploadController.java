package com.apptech.demo.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	@GetMapping("/upload")  
	public String uploadFrom() {
		return "uploadForm";
		
	}
	@PostMapping("/upload")
	public String saveimage(@RequestParam("file") MultipartFile file,Model model) throws IOException {
		if(!file.isEmpty()) {
			FileOutputStream fout = new FileOutputStream("/src/main/resources/static/images/"+file.getOriginalFilename());
		fout.write(file.getBytes());
		fout.close();
		model.addAttribute("message","upload success");
		return "uploadForm";
		}
		model.addAttribute("message","upload failed");
		return "uploadForm";

}
}
