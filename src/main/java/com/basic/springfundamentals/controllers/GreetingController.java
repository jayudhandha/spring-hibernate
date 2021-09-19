package com.basic.springfundamentals.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	@GetMapping("/greetings")
	public String greeting(@RequestParam(defaultValue = "How are you?", required = false, name = "message") String message,
			Model model) {
		
		model.addAttribute("message", message);
		
		return "greeting";
	}
}

