package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MiControlador {

	@RequestMapping(path = "/saludar", method = RequestMethod.GET)
	public ModelAndView saludar(@RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido) {
		ModelMap modelo = new ModelMap();
		modelo.put("name", nombre);
		modelo.put("surname", apellido);
		return new ModelAndView("saludo", modelo);
	}
	
	
	@RequestMapping(path = "home/{nombre}", method = RequestMethod.GET)
	public ModelAndView bienvenida(@PathVariable String nombre) {
		String saludo = "Bienvenido " + nombre;
		ModelMap modelo = new ModelMap();
		modelo.put("nombre", saludo);
		return new ModelAndView("bienvenida", modelo);
	}

	@RequestMapping(path="/saludar/{name}/{surname}" , method = RequestMethod.GET)
	public ModelAndView saludarlos(@PathVariable String name,@PathVariable String surname) {
		ModelMap modelo = new ModelMap();
		modelo.put("nombre",name);
		modelo.put("apellido",surname);
		
		return new ModelAndView("saludo",modelo);
	}
}
