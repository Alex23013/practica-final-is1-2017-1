package controller;

import domain.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AlumnoService;

/**
 * Created by Maria on 01/07/2017.
 */
@Controller
public class AlumnoController {
   // @Autowired
    AlumnoService alumnoService;

    @RequestMapping(value ="/alumnoByApellidoP", method = RequestMethod.GET)
    @ResponseBody
    public Alumno  getAlumnoByApellido(@RequestParam String apellido){
        return alumnoService. getAlumnoByApellido(apellido);
    }
}
