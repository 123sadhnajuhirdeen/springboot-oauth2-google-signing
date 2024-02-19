package com.sadhna.google.auth;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SadhnaOauthSecurityApplication {

	@GetMapping
	public String welcome()
	{
		return "Wel come google from Oauth login!!!";
	}
	
	@GetMapping("/user")
	public Principal user(Principal principal)
	{
		System.out.println("user is: "+ principal.getName());
		return principal;
	}
	public static void main(String[] args) {
		SpringApplication.run(SadhnaOauthSecurityApplication.class, args);
	}

}
