package pe.edu.upeu.spring.service;

import java.util.List;

import pe.edu.upeu.spring.entities.documentos.Categoria;

public interface CategoriaService {

	Categoria crear(Categoria pe);
	
	List<Categoria> Lisall();

}
