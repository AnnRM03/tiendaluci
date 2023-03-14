package com.tiendaluci.tiendaluci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/prom")
@Controller
public class PromoController {
	@GetMapping("/index")
	public String mostrarIndex() {
		return"promociones";
	}
}
