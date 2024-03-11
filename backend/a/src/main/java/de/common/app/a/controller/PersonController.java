package de.common.app.a.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@RequestMapping("/test")
	public String AppA(){
		return ("Application A");
	}
	
	@RequestMapping("/hello")
	public String HelloA(){
		return "Hello A";
	}
}

