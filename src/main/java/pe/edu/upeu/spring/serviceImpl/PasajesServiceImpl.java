package pe.edu.upeu.spring.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring.dao.PasajesDao;
import pe.edu.upeu.spring.entities.documentos.Pasajes;
import pe.edu.upeu.spring.service.PasajesService;

@Service
@Transactional
public class PasajesServiceImpl implements PasajesService{

	@Autowired
	private PasajesDao pasdao;
	
	@Override
	public Pasajes crear(Pasajes pas) {
		// TODO Auto-generated method stub
		try {
			return pasdao.save(pas);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<Pasajes> Listall() {
		// TODO Auto-generated method stub
		return null;
	}

}
