package com.brief.challenge.controller;

import static com.brief.challenge.constant.Routes.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(PATH)
@RestController
public class HelloWorldController {

	@GetMapping({"","/",HELLO_WORLD})
	public String index() {
		return "Hello, World";
	}
	
}
