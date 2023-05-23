package udb.m3.clinica.servicio;

import java.util.List;

import udb.m3.clinica.modelo.Paciente;

public interface IPacienteService extends ICRUD<Paciente> {
	List<Paciente> buscarPaciente(String filtro);
}
