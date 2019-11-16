package net.putfirstthingsfirst.source;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
	
	@RequestMapping("/")
	public String get() {
		return "Spring Boot Development";
	}
}