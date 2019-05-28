package pe.edu.upeu.spring.service;

import java.util.List;

import pe.edu.upeu.spring.entities.documentos.Tipo;


public interface TipoService {
	Tipo crear(Tipo p);
	Tipo editar(Tipo p);
	void eliminar(Long id);
	Tipo buscar(Long id);
	List<Tipo> listar();
}
