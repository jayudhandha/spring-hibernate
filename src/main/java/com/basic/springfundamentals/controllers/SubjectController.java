package com.basic.springfundamentals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.springfundamentals.Student;
import com.basic.springfundamentals.dao.SubjectDao;
import com.basic.springfundamentals.model.SubjectModel;
import com.basic.springfundamentals.response.SubjectResponse;

@RestController
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	private SubjectDao subjectDao;
	
	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public SubjectResponse create(@RequestBody SubjectModel model) {
		return subjectDao.save(model);
	}
	
	@GetMapping(value = "/{id}")
	public SubjectResponse getSubject(@PathVariable("id") Long id) {
		return subjectDao.read(id);
	}
	
	
}
