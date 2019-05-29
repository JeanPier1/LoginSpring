package pe.edu.upeu.spring.service;

import java.util.List;

import pe.edu.upeu.spring.entities.documentos.Actividades;

public interface ActividadService {
	
	Actividades crear(Actividades ac);
	List<Actividades> Listall();

}
