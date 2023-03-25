package com.tiendaluci.tiendaluci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.tiendaluci.tiendaluci.entity.Empleado;
import com.tiendaluci.tiendaluci.service.IntServiceEmpleados;

@RequestMapping("/empleados")
@Controller
public class EmpleadosController {
	@Autowired
	private IntServiceEmpleados serviceEmpleados;
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Empleado> empleados = serviceEmpleados.obtenerEmpleado();
		model.addAttribute("empleado", empleados);
		model.addAttribute("total", serviceEmpleados.numeroEmpleado());
		return"empleados/listaEmpleados";
	}
	
	@PostMapping("/guardar")
	public String guardar (Empleado empleado) {
		serviceEmpleados.guardar(empleado);
		return "redirect:/empleados/index";
	}
	
	@GetMapping("/nueva")
	public String nuevoEmpleado(Empleado empleado) {
		return "empleados/formEmpleado";
	}
	
	@GetMapping("/eliminar")
	public String eliminarEmpleado(@RequestParam("id")int idEmpleado,RedirectAttributes model) {
		serviceEmpleados.eliminar(idEmpleado);
		model.addFlashAttribute("msg","Empleado Eliminado");
		return "redirect:/empleados/index";
	}
	
	@GetMapping("/buscar")
	public String modificarEmpleado(@RequestParam("id")int idEmpleado,Model model) {
		Empleado empleado=serviceEmpleados.buscarPorId(idEmpleado);
		model.addAttribute("empleado", empleado);
		return "empleados/formEmpleado";
	}
}
