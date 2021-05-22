package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.servicios.ServicioUsuario;

@Controller
public class ControladorListar {
	
	@Autowired
	@Qualifier("servicioUsuarioImpl")
	private ServicioUsuario servicioUsuario;

	@RequestMapping(path = "listar-usuarios/{rol}", method = RequestMethod.GET)
	public ModelAndView listarUsuarios(@PathVariable String rol) {
		ModelMap modelo = new ModelMap();
		modelo.put("rol", rol);
		try {
			modelo.put("usuarios", servicioUsuario.buscarUsuarios(rol));
		}
		catch(Exception e) {
			modelo.put("error", e.getMessage());
		}
		
		return new ModelAndView("listaUsuarios", modelo);
	}
}
