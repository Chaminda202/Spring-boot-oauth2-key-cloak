package com.spring.keycloak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConsumerController {
	@Autowired
	private OAuth2RestTemplate oauth2RestTemplate;
	
	@GetMapping
	@RequestMapping("/consumer")
	public String helloWorld(){
		String response = oauth2RestTemplate.getForObject("http://localhost:8580/test", String.class);
		return "Call Consumer -> "+response;
	}
}
