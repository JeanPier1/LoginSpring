package pe.edu.upeu.spring.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring.dao.GdetalleDao;
import pe.edu.upeu.spring.entities.documentos.Gdetalle;
import pe.edu.upeu.spring.service.GdetalleService;

@Service
@Transactional
public class GdetalleServiceImpl implements GdetalleService{

	@Autowired
	private GdetalleDao gdea;
	
	@Override
	public Gdetalle crear(Gdetalle pe) {
		return gdea.save(pe);
	}

}
