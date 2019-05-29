package pe.edu.upeu.spring.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring.dao.Facturadetalle;
import pe.edu.upeu.spring.entities.documentos.Facdetalle;
import pe.edu.upeu.spring.service.FacturadodetalleService;

@Service
@Transactional
public class FacturadodetallesServiceImpl implements FacturadodetalleService {
	
	@Autowired
	private Facturadetalle factde;
	
	@Override
	public Facdetalle crear(Facdetalle facde) {
		try {
			return factde.save(facde);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}

}
