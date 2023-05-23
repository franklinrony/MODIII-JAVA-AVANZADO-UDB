package udb.m3.clinica.servicio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import udb.m3.clinica.modelo.Medico;

public interface IMedicoService extends ICRUD<Medico> {
	List<Medico> buscarMedico(String filtro);

}
