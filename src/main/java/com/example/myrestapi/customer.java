package com.example.myrestapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/employees")
@RestController
public class customer {
	//@RequestMapping(value={"/hello"}, method=RequestMethod.GET)
	@GetMapping
	public String helloworld() {
		return "Hello";
	}
}
