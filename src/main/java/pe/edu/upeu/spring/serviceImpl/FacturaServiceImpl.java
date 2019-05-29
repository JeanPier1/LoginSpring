package pe.edu.upeu.spring.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.spring.dao.FacturadoDao;
import pe.edu.upeu.spring.entities.documentos.Facturado;
import pe.edu.upeu.spring.service.FacturadoService;

public class FacturaServiceImpl implements FacturadoService {

	@Autowired
	private FacturadoDao nuev;
	
	@Override
	public Facturado crear(Facturado fac) {
		// TODO Auto-generated method stub
		try {
			return nuev.save(fac);
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println(e);
		}
		return null;
	}

	@Override
	public List<Facturado> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
