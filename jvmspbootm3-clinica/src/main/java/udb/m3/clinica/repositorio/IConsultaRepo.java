package udb.m3.clinica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import udb.m3.clinica.modelo.Consulta;

public interface IConsultaRepo extends JpaRepository<Consulta, Integer> {

}
