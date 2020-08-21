package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.HiClient;

@RestController
public class HelloController {
	
	@Autowired
	private HiClient hiClient;
	
	@GetMapping(value = "/helloMsg/{name}")
	public String helloMsg(@PathVariable("name") String name) {
		String s = hiClient.invokeHiService(name);
		return "Hello"+name+s;
	}

}
