package com.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderImpl {

	
	@GetMapping(path = "/hi", produces = "application/json")
	public String greeting() {
		return "Hello";
	}
}
