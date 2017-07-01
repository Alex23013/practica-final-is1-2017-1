package repository;

import domain.Curso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by Maria on 01/07/2017.
 */
public interface CursoRepository extends CrudRepository<Curso, Long> {



    //Permite Lista todos los cursos
    @Query("select a from Curso a ")
    Collection<Curso> findAll();

    //* Buscar un determinado curso dado su codigo
    @Query("select a from Curso a where a.codigo = ?1")
    Curso findCursoByCodigo(String codigo);

    //**Buscar un determinado curso dado una parte de su nombre
    @Query("select a from Curso a where a.nombre like ?1")
    Curso findCursoByNombre(String nombre);

}
