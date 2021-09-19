package com.basic.springfundamentals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.basic.springfundamentals.dao.SubjectDao;
import com.basic.springfundamentals.response.SubjectResponse;

@Controller
public class GreetingController {
	
	@Autowired
	private SubjectDao subjectDao;

	@GetMapping("/greetings")
	public String greeting(@RequestParam(defaultValue = "How are you?", required = false, name = "message") String message,
			Model model) {
		
		model.addAttribute("message", message);
		
		return "greeting";
	}
	
	@GetMapping("/subjects/{id}")
	public String greeting(@PathVariable("id") Long id,
			Model model) {
		
		SubjectResponse response = subjectDao.read(id);
		model.addAttribute("name", response.getSubjectModel().getName());
		model.addAttribute("code", response.getSubjectModel().getCode());
		
		return "subjectInfo";
	}
}

