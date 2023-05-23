package sv.edu.udb.springboot.m3.pracjpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.edu.udb.springboot.m3.pracjpa.dtos.GenericResponse;
import sv.edu.udb.springboot.m3.pracjpa.entidades.Estudiante;
import sv.edu.udb.springboot.m3.pracjpa.services.EstudianteService;

@RestController
@RequestMapping("estudiante")
public class EstudianteController {

	String respJson = "";
	@Autowired
	private final EstudianteService servicio;
	public EstudianteController(EstudianteService servicio) {
	this.servicio=servicio;
	}
	@GetMapping(value = "listar")
	public Iterable<Estudiante> listaEstudiante() throws IOException {
	Iterable<Estudiante> lista = servicio.buscarTodos();
	return lista;
	}
	@PutMapping(value="editar/{codigo}")
	public Estudiante editar(@PathVariable("codigo") int codigo, @RequestBody
	Estudiante estudiante ) {
	return servicio.actualizar(estudiante);
	}
	@PostMapping(value="agregar")
	public Estudiante insertarEstudiante(@RequestBody Estudiante estudiante ) {
	return servicio.insertar(estudiante);
	}
	@DeleteMapping(value="eliminar/{codigo}")
	public GenericResponse borrarEstudiante(@PathVariable("codigo") int codigo) {
	GenericResponse res=null;
	if(servicio.borrar(new Estudiante(codigo))) {
	res=new GenericResponse(1,"Eliminacion Exitosa del reistro con codigo "+codigo);
	}else {
	res=new GenericResponse(0,"Eliminacion del reistro con codigo "+codigo+" no se completo");
	}
	return res;
	}

}
