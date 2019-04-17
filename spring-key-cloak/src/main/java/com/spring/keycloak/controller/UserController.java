package com.spring.keycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping(value="/user/test")
	public String retrieveUser(){
		return "Wellcome user controller";
	}
}
