package com.brief.challenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.brief.challenge.constants.Routes.*;

@RequestMapping(PATH)
@RestController
public class HelloWorldController {

	@GetMapping({"","/",HELLO_WORLD})
	public String index() {
		return "Hello, World";
	}
	
}
