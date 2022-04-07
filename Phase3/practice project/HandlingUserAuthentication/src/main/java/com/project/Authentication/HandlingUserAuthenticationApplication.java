package com.project.Authentication;

import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Import({
AuthenticationController.class,
UserNotFoundException.class,
AuthenticationService.class,
User.class
})

public class HandlingUserAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandlingUserAuthenticationApplication.class, args);
	}

}
