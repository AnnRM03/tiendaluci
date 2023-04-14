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

import com.tiendaluci.tiendaluci.entity.Producto;
import com.tiendaluci.tiendaluci.service.IntServiceCategorias;
import com.tiendaluci.tiendaluci.service.IntServiceProductos;

@RequestMapping("/productos")
@Controller
public class ProductosController {
	@Autowired
	private IntServiceProductos serviceProductos;

	@Autowired
	private IntServiceCategorias serviceCategorias;

	@PostMapping("/guardar")
	public String guardar(Producto producto, RedirectAttributes model) {
		serviceProductos.guardar(producto);
		return "redirect:/productos/index";
	}

	@GetMapping("/eliminar")
	public String eliminarProducto(@RequestParam("id") int idProducto, RedirectAttributes model) {
		serviceProductos.eliminar(idProducto);
		model.addFlashAttribute("msg", "Producto eliminado");
		return "redirect:/productos/index";

	}

	@GetMapping("/nueva")
	public String nuevoProducto(Producto producto, Model model) {
		model.addAttribute("categorias", serviceCategorias.obtenerCategoria());
		return "productos/formProducto";
	}
	
	@GetMapping("/buscar")
	public String buscar(@RequestParam("id") int idProducto, Model model) {
		Producto producto = serviceProductos.buscarPorId(idProducto);
		model.addAttribute("categorias", serviceCategorias.obtenerCategoria());
		model.addAttribute("producto", producto);
		return "productos/formProducto";
	}

	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Producto> productos = serviceProductos.obtenerProductos();
		model.addAttribute("productos", productos);
		model.addAttribute("total", serviceProductos.numeroProductos());
		return "productos/listaProductos";
	}

}
