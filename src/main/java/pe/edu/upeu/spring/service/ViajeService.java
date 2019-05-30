package pe.edu.upeu.spring.service;

import java.util.List;

import pe.edu.upeu.spring.entities.documentos.Viaje;

public interface ViajeService {

	Viaje crear(Viaje pe);	

	List<Viaje> readll();
}
