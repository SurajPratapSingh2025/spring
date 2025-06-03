package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.dto.EmployeeDTO;

@Controller
public class MyController {
	
	@GetMapping(path= {"/","index","welcome"})
	public String welcomeView() {
		
		return "index";
	}
	
	@GetMapping(path= {"insert"})
	public String insertView() {
		
		return "insert";
	}
	
	@PostMapping(path= {"insert"})
	public String insertData(@ModelAttribute EmployeeDTO emp,Model m) {
		
		System.out.println(emp);
		return "insert";
	}
	
	
	
	
	
}

