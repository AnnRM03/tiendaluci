package com.tiendaluci.tiendaluci.controller;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tiendaluci.tiendaluci.entity.Promocion;
import com.tiendaluci.tiendaluci.service.IntServicePromociones;

@RequestMapping("/promociones")
@Controller
public class PromocionesController {
	@Autowired
	private IntServicePromociones servicePromociones;
	
	@PostMapping("/guardar")
	public String guardar(Promocion promocion, RedirectAttributes model) {
		servicePromociones.guardar(promocion);
		return "redirect:/promociones/index";
	}
	
	@GetMapping("/eliminar")
	public String eliminarPromocion(@RequestParam("id") int idPromocion, RedirectAttributes model) {
		servicePromociones.eliminar(idPromocion);
		model.addFlashAttribute("msg", "Promocion eliminada");
		return "redirect:/promociones/index";
		
	}
	
	@GetMapping("/nueva")
	public String nuevPromocion(Promocion promocion, Model model) {
		model.addAttribute("promociones", servicePromociones.obtenerPromociones());
		return"promociones/formPromociones";
	}
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Promocion> promocion = servicePromociones.obtenerPromociones();
		model.addAttribute("promociones", promocion);
		model.addAttribute("total", servicePromociones.numeroPromociones());
		return"promociones/listaPromociones";
	}
	
	@GetMapping("/buscar")
	public String modificarPromocion(@RequestParam("id")int idPromocion,Model model) {
		Promocion promocion=servicePromociones.buscarPorId(idPromocion);
		model.addAttribute("promocion", promocion);
		return "promociones/formPromociones";
	}
	
	@InitBinder
    protected void initBinder(WebDataBinder binder) {
      binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
        @Override
        public void setAsText(String text) throws IllegalArgumentException{
          setValue(LocalDate.parse(text, DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }

        @Override
        public String getAsText() throws IllegalArgumentException {
          return DateTimeFormatter.ofPattern("dd-MM-yyyy").format((LocalDate) getValue());
        }  
    
      });
  }
	
}
