package service;

import domain.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CursoRepository;

import java.util.Collection;

/**
 * Created by Maria on 01/07/2017.
 */
//@Service
public class CursoService {

    @Autowired
    CursoRepository cursoRepository;

    public void save(Curso curso) {
        cursoRepository.save(curso);
    }

    public Collection<Curso> findAll(){return  cursoRepository.findAll();}

    public Curso findCursoByCodigo(String codigo){return cursoRepository.findCursoByCodigo(codigo);}

    public Curso findCursoByNombrePart(String codigo){return cursoRepository.findCursoByNombre(codigo);}

    public String asd(){return "asd";}

}
