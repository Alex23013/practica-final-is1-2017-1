package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CursoService;
import domain.Curso;

import java.util.Collection;

/**
 * Created by Maria on 01/07/2017.
 */
@Controller
public class CursoController {

    //@Autowired
    CursoService cursoService = new CursoService();

    @RequestMapping(value = "/cursos", method = RequestMethod.GET)
    @ResponseBody
    public  Collection<Curso> getCursos (){
        return  cursoService.findAll();
    }

    @RequestMapping(value ="/cursoByCodigo", method = RequestMethod.GET)
    @ResponseBody
    public Curso CursoByCodigo(@RequestParam String codigo){
        return cursoService.findCursoByCodigo(codigo);
    }

    @RequestMapping(value ="/cursoByNombre", method = RequestMethod.GET)
    @ResponseBody
    public Curso CursoByNombre(@RequestParam String nombre){
        return cursoService.findCursoByNombrePart(nombre);
    }

    @RequestMapping(value ="/a", method = RequestMethod.GET)
    @ResponseBody
    public String Ccc(){
        return cursoService.asd();
    }
}
