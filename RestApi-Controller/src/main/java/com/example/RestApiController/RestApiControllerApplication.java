package com.example.RestApiController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiControllerApplication.class, args);
	}

}


//http://localhost:8080/add_user?id=1&name='Tanmoy'&country='India'&age='24'
