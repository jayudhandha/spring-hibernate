package com.basic.springfundamentals.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApiConfig {

	// some code to read db username & pass
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
//	@Bean
//	public String getDbUser() {
//		// return username of db
//		return null;
//	}
//	
//	@Bean
//	public String getDbPass() {
//		// return username of db
//		return null;
//	}
	
}
