package udb.m3.clinica.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import udb.m3.clinica.modelo.Paciente;

public interface IPaciente extends JpaRepository<Paciente, Integer> {
	@Query("from Paciente p where (LOWER(p.nombrePaciente) like %:filtro% or LOWER(p.apellidoPaciente) like %:filtro%)")
	List<Paciente> buscarPaciente(@Param("filtro") String filtro);
}
