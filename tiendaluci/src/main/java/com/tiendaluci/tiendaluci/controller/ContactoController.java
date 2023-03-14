package com.tiendaluci.tiendaluci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/contacto")
@Controller
public class ContactoController {
	@GetMapping("/index")
	public String mostrarIndex() {
		return"contact";
	}
}
