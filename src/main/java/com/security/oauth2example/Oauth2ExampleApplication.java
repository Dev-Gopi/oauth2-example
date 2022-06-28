package com.security.oauth2example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class Oauth2ExampleApplication {

	@GetMapping("/")
	public String message(Principal principal) {
		return "Hi "+principal.getName()+" welcome to Spring CloudOauth2 Example Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ExampleApplication.class, args);
	}

}
