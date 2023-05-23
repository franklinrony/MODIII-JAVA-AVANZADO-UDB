package udb.m3.clinica.controller;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import udb.m3.clinica.modelo.Consulta;
import udb.m3.clinica.modelo.DetalleConsulta;
import udb.m3.clinica.modelo.GenericResponse;
import udb.m3.clinica.servicio.IConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
	private final IConsultaService servicioConsulta;
	
	public ConsultaController(IConsultaService servicioConsulta) {
		// TODO Auto-generated constructor stub
		this.servicioConsulta = servicioConsulta;
	}
	
	@PostMapping
	public ResponseEntity<GenericResponse<Consulta>> guardarConsulta(@RequestBody Consulta consulta){
		GenericResponse<Consulta> resp = new GenericResponse<Consulta>(0,"fallo - no pudo almacenarse la consulta",consulta);
		Optional<Consulta> opt = Optional.ofNullable(consulta);
		Consulta conSelect= new Consulta();
		HttpStatus http = HttpStatus.INTERNAL_SERVER_ERROR;
		System.out.println(consulta);
		
		if(opt.isPresent()) {
			if(consulta.getDetalleConsulta().size()>0) {
				consulta.getDetalleConsulta()
				.stream()
				.peek(dt->dt.setConsulta(consulta))
				.collect(Collectors.toList());
				try {
					conSelect=servicioConsulta.registrar(consulta);
					resp.setCode(1);
					resp.setMessage("Exito - Se almaceno Consulta");
					resp.setResponse(conSelect);
				} catch (Exception e) {
					// TODO: handle exception
					resp.setMessage("fallo - error: "+e.getMessage());
				}
			}
		}
		System.out.println(resp);
		return new ResponseEntity<GenericResponse<Consulta>>(resp,HttpStatus.OK);
	}
}
