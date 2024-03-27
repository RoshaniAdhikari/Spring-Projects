package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first program")
public class HelloController {
	@GetMapping("/display")
	public String display() {
		return "My first application using using sts";		
	}
	@PostMapping("/print")
	public String printName(@RequestBody String fullName)
	{
		return "Hello "+fullName;
	}

}
