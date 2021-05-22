package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.servicios.ServicioCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorCursos {

    @Autowired
    private ServicioCurso servicioCurso;

    //Trae todos los cursos
    @RequestMapping(path = "listar-cursos" , method = RequestMethod.GET)
    public ModelAndView listarCursos(){
        ModelMap model = new ModelMap();
        model.put("CURSOS",servicioCurso.todosLosCursos());

        return new  ModelAndView("cursos",model);
    }

    //Filtra los cursos por nombre
    @RequestMapping(path = "listar-cursos/{nombre}" , method = RequestMethod.GET)
    public ModelAndView listarCursos(@PathVariable String nombre){
        ModelMap model = new ModelMap();
        model.put("CURSO_BUSCADO",nombre);

        try {
            model.put("CURSOS",servicioCurso.buscarCurso(nombre));
        }
        catch (Exception e){
            model.put("ERROR","Ha ocurrido un error inesperado");
        }
        return new  ModelAndView("cursos",model);
    }
}
