package pe.edu.upeu.spring.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring.dao.ActividadesDao;
import pe.edu.upeu.spring.entities.documentos.Actividades;
import pe.edu.upeu.spring.service.ActividadService;

@Service
@Transactional
public class ActividadesServiceImpl implements ActividadService{
	
	@Autowired
	private ActividadesDao activ;

	@Override
	public Actividades crear(Actividades ac) {
		try {
			return activ.save(ac);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}

	@Override
	public List<Actividades> Listall() {
		try {
			return (List<Actividades>) activ.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			}
		
		return null;
	}

}
