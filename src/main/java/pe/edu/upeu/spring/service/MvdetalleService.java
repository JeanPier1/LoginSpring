package pe.edu.upeu.spring.service;

import java.util.List;

import pe.edu.upeu.spring.entities.documentos.MvDetalle;

public interface MvdetalleService {
	MvDetalle crear(MvDetalle mvdeta);
	
	List<MvDetalle> readll();

}
