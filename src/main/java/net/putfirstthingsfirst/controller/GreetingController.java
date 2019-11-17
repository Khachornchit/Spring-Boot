package net.putfirstthingsfirst.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("/")
	public String get() {
		return "Spring Boot Development";
	}
}