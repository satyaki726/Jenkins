package com.cts.springsecurityjwt;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/home")
	public String showIndex() {
		return "index";
	}
}
