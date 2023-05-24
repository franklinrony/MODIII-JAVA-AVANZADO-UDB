package udb.m3.clinica.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import udb.m3.clinica.modelo.GenericResponse;
import udb.m3.clinica.modelo.Paciente;
import udb.m3.clinica.servicio.IPacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	private IPacienteService iPacienteService;

	
	
	public PacienteController(IPacienteService iPaciente) {
		super();
		this.iPacienteService = iPaciente;
	}

	@GetMapping("/listaPacientes")
	public ResponseEntity<List<Paciente>> mostrarPacientes(){
		List<Paciente> pacientes = this.iPacienteService.listar();		
		return new ResponseEntity<List<Paciente>>(pacientes,HttpStatus.OK);
	}
	
	@PostMapping("/guardarPaciente")
	public Paciente guardar(@RequestBody Paciente paciente) {
		return this.iPacienteService.registrar(paciente);
	}
	
	// editar informacion existente
	@PutMapping("/actualizarPaciente")
	public ResponseEntity<GenericResponse<Paciente>> editarPaciente(@RequestBody Paciente paciente) {
		Optional<Paciente> opt = Optional.ofNullable(this.iPacienteService.leerPorId(paciente.getIdPaciente()));
		GenericResponse<Paciente> resp;
		Paciente pacienteResponse;
		if(opt.isPresent()) {
			pacienteResponse=guardar(paciente);
			resp = new GenericResponse<Paciente>(1,"Paciente guardado con exito",pacienteResponse);
			return new ResponseEntity<GenericResponse<Paciente>>(resp,HttpStatus.OK);
		}else {
			resp = new GenericResponse<Paciente>(0,"Paciente no fue guardado",paciente);
			return new ResponseEntity<GenericResponse<Paciente>>(resp,HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}
	
	@DeleteMapping("borrarPaciente/{id}")
	public ResponseEntity<GenericResponse<Paciente>> eliminarPaciente(@PathVariable("id") Integer id){
		Optional<Paciente> opt = Optional.ofNullable(this.iPacienteService.leerPorId(id));
		GenericResponse<Paciente> resp=new GenericResponse<Paciente>();
		HttpStatus http = HttpStatus.INTERNAL_SERVER_ERROR;
		if(opt.isPresent()) {
			if(this.iPacienteService.eliminar(opt.get())) {
				resp.setCode(1);
				resp.setMessage("Exito - Se elimino Paciente");
				resp.setResponse(opt.get());				
			}else {
				resp.setCode(0);
				resp.setMessage("Fallo - No pudo eliminarse paciente");
				resp.setResponse(opt.get());
			}
		}else {
			resp.setCode(0);
			resp.setMessage("Fallo - No hay paciente que eliminar");
		}
		return new ResponseEntity<GenericResponse<Paciente>>(resp,http);
	}
	
}
