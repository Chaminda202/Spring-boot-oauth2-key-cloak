package com.spring.keycloak.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {
	@GetMapping(path = { "/", "/index" })
	public String index() {
		return "Hello world...!!!";
	}

	@GetMapping(path = "/products")
	public List<String> getProducts() {
		return Arrays.asList("iPhone", "iPad", "Mac");
	}
}
