package com.tiendaluci.tiendaluci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
		@GetMapping("/index")
		public String mostrarIndex() {
			return"index";
		}
		
		@GetMapping("/blog")
		public String mostrarBlog() {
			return"blog";
		}
		
		@GetMapping("/contacto")
		public String mostrarContacto() {
			return"contact";
		}
		
		@GetMapping("/login")
		public String mostrarLogin() {
			return"login";
		}
		
		@GetMapping("/promo")
		public String mostrarPromo() {
			return"promociones";
		}
		
		@GetMapping("/registro")
		public String mostrarRegistro() {
			return"registrarse/registro";
		}
}
