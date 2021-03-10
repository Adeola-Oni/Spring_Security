package com.adeola.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {
	
	@GetMapping("/about")
	public String myAbout() {
		return "This explains my about";
	}

}
