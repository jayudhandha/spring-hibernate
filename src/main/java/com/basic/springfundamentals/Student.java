package com.basic.springfundamentals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Student {

	private String name;
	private int rollNo;
	private String email;

	// 1. DI using annotation
	@Autowired
	private Subject sub;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 2. DI using constructor or Constructor Injection
	public Student(Subject sub) {
		this.sub = sub;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Subject getSub() {
		return sub;
	}

	// 3. DI using setter (Setter injection)
	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public void getYourSubject() {
		System.out.println(this.sub.getName());
	}

	public void message() {
		System.out.println("Hello Students...");
	}

}
