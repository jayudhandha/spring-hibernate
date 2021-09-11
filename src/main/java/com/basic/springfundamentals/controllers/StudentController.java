package com.basic.springfundamentals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.basic.springfundamentals.Student;

@RestController
public class StudentController {

	@Autowired
	private Student std;
	
	@GetMapping(value = "/student")
	public Student getStudents() {
		std.setEmail("test@gmail.com");
		std.setRollNo(1);
		std.setName("Virat");
		return std;
	}
	
	@GetMapping(value = "/student/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		std.setEmail("test@gmail.com");
		std.setRollNo(id);
		std.setName("Virat");
		return std;
	}
	
	@PostMapping(value = "/student", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Student createStudent(@RequestBody Student stdObject) {
		std.setEmail(stdObject.getEmail());
		std.setName(stdObject.getName());
		std.setRollNo(stdObject.getRollNo());
		
		return std;
	}
	
//	@RequestMapping(method = RequestMethod.GET, value = "/getAnotherStudent/{id}")
//	public Student getAnotherStudent(@PathVariable("id") int id) {
//		std.setEmail("test"+id+"@gmail.com");
//		std.setRollNo(id);
//		std.setName("Virat");
//		return std;
//	}
	
	
	
}
