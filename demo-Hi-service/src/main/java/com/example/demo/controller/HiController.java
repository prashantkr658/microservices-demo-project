package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
	
	@GetMapping("/welcome/{name}")
	public String hiMsg(@PathVariable("name") String name) {
		return "Hi, welcome to controller";
	}

}
