package pe.edu.upeu.spring.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring.dao.NofacturaDao;
import pe.edu.upeu.spring.entities.documentos.Nofacturado;
import pe.edu.upeu.spring.service.NoFacturadoService;

@Service
@Transactional
public class NoFacturadoServiceImpl implements NoFacturadoService{
	
	@Autowired
	private NofacturaDao nf;
	
	@Override
	public Nofacturado crear(Nofacturado pe) {
		try {
			
			return nf.save(pe);
		} catch (Exception e) {
			// TODO: handle exception
			return null;

		}
	}

}
