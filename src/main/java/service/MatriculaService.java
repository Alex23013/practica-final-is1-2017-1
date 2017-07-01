package service;

import domain.Curso;
import domain.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import repository.AlumnoRepository;
import repository.CursoRepository;
import repository.MatriculaRepository;

import java.util.Collection;

/**
 * Created by Maria on 01/07/2017.
 */
public class MatriculaService {

    @Autowired
    MatriculaRepository matriculaRepository;

    @Autowired
    AlumnoRepository alumnoRepository;

    @Autowired
    CursoRepository cursoRepository;

    public Collection<Matricula> buscarAlumnos(Curso curso, String semestre){
        return matriculaRepository.findByCursoAndSemestre(curso, semestre);
    }
    

}
