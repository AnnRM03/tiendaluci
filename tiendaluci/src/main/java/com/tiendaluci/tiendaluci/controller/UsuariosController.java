package com.tiendaluci.tiendaluci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tiendaluci.tiendaluci.service.IntServiceUsuarios;

@Controller

@RequestMapping("/usuarios")
public class UsuariosController {
	
	@Autowired
	private IntServiceUsuarios serviceUsuarios;
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		model.addAttribute("usuarios", serviceUsuarios.obtnerUsuarios());
		System.out.println(serviceUsuarios.obtnerUsuarios());
		return "usuario/listaUsuarios";
	}

}
