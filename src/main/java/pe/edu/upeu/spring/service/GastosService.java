package pe.edu.upeu.spring.service;

import java.util.List;

import pe.edu.upeu.spring.entities.documentos.Gastos;

public interface GastosService {
	
	Gastos crear(Gastos pe);
	Gastos editar(Gastos per);
	void eliminar(Long id);
	Gastos buscar(Long id);
	List<Gastos> listar();

}
