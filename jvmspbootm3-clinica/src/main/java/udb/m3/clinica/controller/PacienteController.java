package udb.m3.clinica.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import udb.m3.clinica.modelo.Medico;
import udb.m3.clinica.modelo.Paciente;
import udb.m3.clinica.repositorio.IPaciente;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	private IPaciente iPaciente;

	public PacienteController(IPaciente iPaciente) {
		super();
		this.iPaciente = iPaciente;
	}
	
	@GetMapping("/listaPacientes")
	public ResponseEntity<List<Paciente>> mostrarPacientes(){
		List<Paciente> pacientes = this.iPaciente.findAll();		
		return new ResponseEntity<List<Paciente>>(pacientes,HttpStatus.OK);
	}
	
	@PostMapping("guardarPaciente")
	public Paciente guardarMedico(@RequestBody Paciente paciente) {
		return this.iPaciente.save(paciente);
	}
}
