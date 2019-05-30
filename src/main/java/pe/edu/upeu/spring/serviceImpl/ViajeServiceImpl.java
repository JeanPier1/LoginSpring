package pe.edu.upeu.spring.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring.dao.ViajeDao;
import pe.edu.upeu.spring.entities.documentos.Viaje;
import pe.edu.upeu.spring.service.ViajeService;

@Service
@Transactional
public class ViajeServiceImpl implements ViajeService{
	
	@Autowired
	private ViajeDao viajeD;
	
	@Override
	public Viaje crear(Viaje pe) {
		// TODO Auto-generated method stub
		try {
			return viajeD.save(pe);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}

	@Override
	public List<Viaje> readll() {
		try {
			return viajeD.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
