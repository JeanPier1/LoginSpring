package pe.edu.upeu.spring.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.spring.dao.InfGastos;
import pe.edu.upeu.spring.entities.documentos.Infgasto;
import pe.edu.upeu.spring.service.InfGastoService;

public class InfGastosServiceImpl implements InfGastoService{

	@Autowired
	private InfGastos ing;
	
	@Override
	public Infgasto crear(Infgasto pe) {
		// TODO Auto-generated method stub
		try {
			return ing.save(pe);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
