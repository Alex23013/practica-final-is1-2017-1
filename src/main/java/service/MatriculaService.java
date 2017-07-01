package service;

import domain.Alumno;
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

    public void matricularAlumno (Long idAlu, Long idCurso){
       Alumno a = alumnoRepository.findOne(idAlu);
       Curso c = cursoRepository.findOne(idCurso);
       double cero = 0;
       Matricula m = new Matricula(a,c,cero ,"1");
     //TODO: Comprobar que cumplio los prerequisitos
        matriculaRepository.save(m);
    }


    public String ponerNota (Long idAlu,Long idCurso, Double nota){
        Alumno a = alumnoRepository.findOne(idAlu);
        Curso c = cursoRepository.findOne(idCurso);

        if(matriculaRepository.findAlumno(a,c).isEmpty()){
            return "El alumno no esta matriculado en el curso";
        }else{
            return "nota subida";
        }
    }



}
