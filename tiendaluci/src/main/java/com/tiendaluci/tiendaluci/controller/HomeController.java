package com.tiendaluci.tiendaluci.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/index")
	public String mostrarIndex() {
		return"index";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "registro";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";	
	}
}
