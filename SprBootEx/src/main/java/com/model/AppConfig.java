package com.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfig {
	@RequestMapping("/message")
	public String printMessage() {
	return "Good night All";
	}
}
