package controller;

import domain.Curso;
import domain.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.MatriculaService;

import java.util.Collection;

/**
 * Created by Maria on 01/07/2017.
 */
@Controller
public class MatriculaController {

    //@Autowired
    MatriculaService matriculaService;

//Listar los alumnos matriculados en un deteminado curso y semestre con sus respectivas notas.

    @RequestMapping(value ="/findAlumnosWhere", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Matricula> findAlumnos(@RequestParam Curso curso,@RequestParam String semestre){
       return  matriculaService.buscarAlumnos( curso, semestre);
    }

    @RequestMapping(value ="/matricularAlumno", method = RequestMethod.POST)
    @ResponseBody
    public void matricularAlumno(@RequestParam Long idAlu,@RequestParam Long idCurso){
         matriculaService.matricularAlumno( idAlu,idCurso);
    }

}
