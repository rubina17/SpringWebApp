package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {
	
	@GetMapping("/show")
	public String Display()
	{
		return "wellcom";
	}

}
