package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping(path="/greet", produces= {"text/plain"})
	public String greet() {
		return "<h2>Good Afternoon/h2>";
	}
	
	@GetMapping("/welcome")
	public String xyz() {
		return "<h2>Welcome to Spring Boot</h2>";
	}
	
	@GetMapping("/")
	public String atoz() {
		return "<h2>This is the homepage for the REST demo application</h2>";
	}
	
	@RequestMapping(path="/demo" , method = RequestMethod.GET)
	public String demo() {
		return "<h1>JUST FOR DEMO</h1>";
	}
}
