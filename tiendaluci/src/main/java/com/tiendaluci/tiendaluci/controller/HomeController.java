package com.tiendaluci.tiendaluci.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class HomeController {
	@GetMapping("/index")
	public String mostrarIndex() {
		return"index";
	}
}
