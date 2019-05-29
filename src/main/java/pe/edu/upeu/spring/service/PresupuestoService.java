package pe.edu.upeu.spring.service;

import java.util.List;

import pe.edu.upeu.spring.entities.documentos.Presupuesto;

public interface PresupuestoService {
	Presupuesto crear(Presupuesto presu);
	List<Presupuesto> listall();
}
