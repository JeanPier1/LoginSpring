package pe.edu.upeu.spring.service;

import java.util.List;

import pe.edu.upeu.spring.entities.documentos.Pasajes;

public interface PasajesService {
	Pasajes crear(Pasajes pas);
	List<Pasajes> Listall();

}
