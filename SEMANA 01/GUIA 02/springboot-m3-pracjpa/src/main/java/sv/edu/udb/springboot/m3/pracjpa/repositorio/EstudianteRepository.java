package sv.edu.udb.springboot.m3.pracjpa.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import sv.edu.udb.springboot.m3.pracjpa.entidades.Estudiante;

public interface EstudianteRepository extends CrudRepository<Estudiante,Integer> {
	
	@Query("SELECT f FROM Estudiante f WHERE f.nombre like '%:nombre%'")
	public List<Estudiante> buscarByNombre(@Param("nombre") String nombre);
}
