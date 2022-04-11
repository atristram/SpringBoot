package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HttpDemoController {
	
	@GetMapping("/demo")
	public String getDemo() {
		return "This is from getDemo method using Http GET Method";
	}
	
	@PutMapping("/demo")
	public String putDemo() {
		return "This is from putDemo method using Http PUT Method";
	}
	
	@PostMapping("/demo")
	public String postDemo() {
		return "This is from postDemo method using Http POST Method";
	}
	
	@PatchMapping("/demo")
	public String patchDemo() {
		return "This is from patchDemo method using Http PATCH Method";
	}
	
	@DeleteMapping("/demo")
	public String deleteDemo() {
		return "This is from deleteDemo method using Http DELETE Method";
	}

}
