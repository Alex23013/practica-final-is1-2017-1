package service;

import domain.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AlumnoRepository;

/**
 * Created by Maria on 01/07/2017.
 */
@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    public Alumno getAlumnoByApellido( String Apellido){
        return alumnoRepository.findAlumnoByApellidoPaterno(Apellido);
    };
}
