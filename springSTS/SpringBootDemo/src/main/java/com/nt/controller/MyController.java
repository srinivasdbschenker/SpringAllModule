package com.nt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	//@GetMapping("/")
	@RequestMapping("/hello")
	public String hello() {
		return "hello Good Morning";
	}

}
