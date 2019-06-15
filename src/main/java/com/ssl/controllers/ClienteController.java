package com.ssl.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ClienteController {

	@GetMapping
	public String index() {
		return "Test com o https://  com SSL ";
	}
	
}
