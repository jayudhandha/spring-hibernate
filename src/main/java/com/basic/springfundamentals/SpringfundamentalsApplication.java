package com.basic.springfundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringfundamentalsApplication {

	/**
	 * Dependency Injection	
	 * @param args
	 */
	public static void main(String[] args) {
		// Application Context : Root which will be served once the spring application starts

		ConfigurableApplicationContext context = SpringApplication.run(SpringfundamentalsApplication.class, args);
//		
//		Student std = context.getBean(Student.class);
		
//		std.getYourSubject();
		
		// 1. Create Subject object
		// 2. Create Student object
		// 3. Set subject object in student
		
		// 4. Get Subject name for that student
//		for (int i = 0; i < 5; i++) {
//			SingletonA.getSingletonA();
//		}
		
	}

}

