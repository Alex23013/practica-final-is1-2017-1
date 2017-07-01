package repository;

import domain.Alumno;
import domain.Curso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by Maria on 01/07/2017.
 */
public interface AlumnoRepository extends CrudRepository<Alumno, Long>{

    //Permite Lista a todos los alumnos
    @Query("select a from Alumno a ")
    Collection<Alumno> findAll();

    // * Buscar un alumno por su apellido paterno.
    @Query("select a from Alumno a where a.apellidoPaterno = ?1")
    Alumno findAlumnoByApellidoPaterno(String apellidoP);

}
