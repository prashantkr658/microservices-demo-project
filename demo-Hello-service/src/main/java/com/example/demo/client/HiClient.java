package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("HI-SERVICE")
public interface HiClient {
	
	@GetMapping(value = "/hi/{name}")
	public String invokeHiService(@PathVariable("name") String name);

}
