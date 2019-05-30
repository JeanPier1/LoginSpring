package pe.edu.upeu.spring.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring.dao.PrepuestoDao;
import pe.edu.upeu.spring.entities.documentos.Presupuesto;
import pe.edu.upeu.spring.service.PresupuestoService;

@Service
@Transactional
public class PresupuestoServiceImpl implements PresupuestoService {

	@Autowired
	private PrepuestoDao presa;
	
	@Override
	public Presupuesto crear(Presupuesto presu) {

		try {
			return presa.save(presu);
		} catch (Exception e) {
			// TODO: handle exception
		}return null;
	}

	@Override
	public List<Presupuesto> listall() {
		// TODO Auto-generated method stub
		return null;
	}

}
