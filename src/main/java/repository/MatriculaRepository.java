package repository;

import domain.Curso;
import domain.Matricula;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by Maria on 01/07/2017.
 */
public interface MatriculaRepository extends CrudRepository<Matricula, Long>{

    //Permite Listar a  todas las matriculas
    @Query("select a from Matricula a ")
    Collection<Matricula> findAll();

    //* Listar los alumnos matriculados en un deteminado curso y semestre con sus respectivas notas.
    @Query("select a.alumno , a.nota  from Matricula a where a.curso=?1 and a.semestre=?2")
    Collection<Matricula> findByCursoAndSemestre(Curso curso, String semestre);

}
