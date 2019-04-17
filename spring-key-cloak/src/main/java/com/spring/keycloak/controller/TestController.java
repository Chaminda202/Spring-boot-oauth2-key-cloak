package com.spring.keycloak.controller;

import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping(path = { "/", "/index" })
	public String index(Model model) {
		return "index";
	}

	@GetMapping(path = "/products")
	public String getProducts(Model model) {
		model.addAttribute("products", Arrays.asList("iPhone", "iPad", "Mac"));
		return "products";
	}

	@GetMapping(path = "/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";
	}
}
