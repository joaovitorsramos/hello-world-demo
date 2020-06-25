package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


	@GetMapping("/")
	public String dummyMessage() {
		return "Hello World Pipeline Project - Joao Ramos";
	}
}
