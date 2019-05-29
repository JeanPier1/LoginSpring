package pe.edu.upeu.spring.service;

import java.util.List;

import pe.edu.upeu.spring.entities.documentos.Facturado;

public interface FacturadoService {

	Facturado crear(Facturado fac);
	List<Facturado> listAll();
	
}
