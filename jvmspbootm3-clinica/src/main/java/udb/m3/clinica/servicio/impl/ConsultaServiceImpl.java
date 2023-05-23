package udb.m3.clinica.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import udb.m3.clinica.modelo.Consulta;
import udb.m3.clinica.repositorio.IConsultaRepo;
import udb.m3.clinica.servicio.IConsultaService;

@Service
public class ConsultaServiceImpl implements IConsultaService {

	
	private final IConsultaRepo consultaRepo;
	
	@Autowired
	public ConsultaServiceImpl( IConsultaRepo consultaRepo) {
		// TODO Auto-generated constructor stub
		this.consultaRepo=consultaRepo;
	}
	
	@Override
	public Consulta registrar(Consulta obj) {
		// TODO Auto-generated method stub
		return this.consultaRepo.save(obj);
	}

	@Override
	public Consulta modificar(Consulta obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Consulta> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consulta leerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Consulta obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
