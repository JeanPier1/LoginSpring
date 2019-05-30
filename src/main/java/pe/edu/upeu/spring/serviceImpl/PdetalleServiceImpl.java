package pe.edu.upeu.spring.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring.entities.documentos.Pdetalle;
import pe.edu.upeu.spring.service.PdetalleService;

@Service
@Transactional
public class PdetalleServiceImpl implements PdetalleService {

	@Autowired
	private pe.edu.upeu.spring.dao.Pdetalle nu;
	
	@Override
	public Pdetalle crear(Pdetalle pde) {
		try {
			return nu.save(pde);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
