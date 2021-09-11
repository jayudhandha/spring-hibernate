package com.basic.springfundamentals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.basic.springfundamentals.Student;
import com.sun.net.httpserver.Headers;

@RestController
@RequestMapping("/invokeapi")
public class ApiInvokeController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private Student std;
	
	@GetMapping(value="/getstudent/{id}")
	public Student invokeStudent(@PathVariable("id") int id) {
		// code to call Student API
		
		ResponseEntity<Student> response = restTemplate.getForEntity("http://localhost:8080/student/"+id, Student.class);
		
		return response.getBody();
	}
	
	@GetMapping(value="/getfaculty")
	public Student invokeFaculty() {
		// code to call Student API
		return null;
	}
	
	@PostMapping(value="/createStudent")
	public Student invokeUpdateStudent(@RequestBody Student stdObject) throws ClassNotFoundException {
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
		
		
		std.setName(stdObject.getName());
		std.setEmail(stdObject.getEmail());
		std.setRollNo(stdObject.getRollNo());
		HttpEntity<Student> entity = new HttpEntity<Student>(std, headers);
		ResponseEntity<Student> response = null;
		try {
			response = restTemplate.exchange("http://localhost:8080/student123", HttpMethod.POST, entity, Student.class);
		} catch (HttpClientErrorException e) {
			System.err.println("----------- ERROR in API Call -------");
			System.out.println(e.getStatusCode());
			throw new ClassNotFoundException("Invalid API Call");
		}
		
		
		System.out.println("Value: "+response.getStatusCodeValue());
		System.out.println("Code: "+response.getStatusCode());
		
		return response.getBody();
	}
}
