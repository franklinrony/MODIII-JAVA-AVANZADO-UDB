package udb.m3.clinica.servicio.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import udb.m3.clinica.modelo.Paciente;
import udb.m3.clinica.repositorio.IPaciente;
import udb.m3.clinica.servicio.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{
	private final IPaciente iPaciente;
	
	
	public PacienteServiceImpl(IPaciente iPaciente) {
		super();
		this.iPaciente = iPaciente;
	}

	@Override
	public Paciente registrar(Paciente obj) {
		// TODO Auto-generated method stub
		return iPaciente.save(obj);
	}

	@Override
	public Paciente modificar(Paciente obj) {
		// TODO Auto-generated method stub
		return iPaciente.saveAndFlush(obj);
	}

	@Override
	public List<Paciente> listar() {
		// TODO Auto-generated method stub
		return this.iPaciente.findAll();
	}

	@Override
	public Paciente leerPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iPaciente.findById(id).get();
	}

	@Override
	public boolean eliminar(Paciente obj) {
		// TODO Auto-generated method stub
		try {
			this.iPaciente.delete(obj);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Paciente> buscarPaciente(String filtro) {
		// TODO Auto-generated method stub
		return this.iPaciente.buscarPaciente(filtro);
	}

}
