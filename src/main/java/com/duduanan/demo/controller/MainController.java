package com.duduanan.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		return "hello world";
	}
	@RequestMapping("/test")
	public String newTest() {
		return "new test2";
	}
}
