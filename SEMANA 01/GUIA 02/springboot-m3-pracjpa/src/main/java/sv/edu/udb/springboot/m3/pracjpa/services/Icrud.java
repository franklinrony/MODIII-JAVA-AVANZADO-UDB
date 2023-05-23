package sv.edu.udb.springboot.m3.pracjpa.services;

public interface Icrud<E>{
	Iterable<E> buscarTodos();
	E insertar(E estudiante);
	Boolean borrar(E estudiante);
	E actualizar(E estudiante);
	E buscarById(int codigo);
}
