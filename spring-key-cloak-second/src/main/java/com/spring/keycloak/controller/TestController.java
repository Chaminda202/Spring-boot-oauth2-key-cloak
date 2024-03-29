package com.spring.keycloak.controller;

import java.security.Principal;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	private Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping(path = { "/", "/index" })
	public String index(Model model) {
		return "index";
	}

	@GetMapping(path = "/products")
	public String getProducts(Model model, Principal principal) {
		model.addAttribute("products", Arrays.asList("iPhone", "iPad", "Mac"));
		logger.info("Token username {}", principal.getName());
		return "products";
	}

	@GetMapping(path = "/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";
	}
}
