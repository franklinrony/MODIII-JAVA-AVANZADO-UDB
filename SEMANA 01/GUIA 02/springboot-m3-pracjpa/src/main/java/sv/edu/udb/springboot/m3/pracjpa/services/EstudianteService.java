package sv.edu.udb.springboot.m3.pracjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.udb.springboot.m3.pracjpa.entidades.Estudiante;
import sv.edu.udb.springboot.m3.pracjpa.repositorio.EstudianteRepository;
@Service
public class EstudianteService implements Icrud<Estudiante> {

	public EstudianteService() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	EstudianteRepository repositorio;
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Iterable<Estudiante> buscarTodos() {
	return repositorio.findAll();
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public Estudiante insertar(Estudiante estudiante) {
	return repositorio.save(estudiante);
	}
	@Transactional
	public Boolean borrar(Estudiante estudiante) {
	try {
	repositorio.delete(estudiante);
	return true;
	} catch (Exception e) {
	// TODO: handle exception
	return false;
	}
	}
	@Transactional
	public Estudiante actualizar(Estudiante estudiante) {
	return repositorio.save(estudiante);
	}
	@Transactional
	public Estudiante buscarById(int codigo) {
	return repositorio.findById(codigo).get();
	}
	@Transactional
	public List<Estudiante> buscarByNombre(String nombre) {
	return repositorio.buscarByNombre(nombre);

	}
}
