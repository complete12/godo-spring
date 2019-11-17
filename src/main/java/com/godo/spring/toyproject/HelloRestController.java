package com.godo.spring.toyproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @controller + @ResponseBody
public class HelloRestController {
	@GetMapping("/hello")
	public String index() {
		return "Hello World!";
	}
}
