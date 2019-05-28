package pe.edu.upeu.spring.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring.dao.TipoDao;
import pe.edu.upeu.spring.entities.documentos.Tipo;
import pe.edu.upeu.spring.service.TipoService;

@Service
@Transactional	
public class TipoServiceImpl implements TipoService{
	@Autowired
	private TipoDao up;

	@Override
	public Tipo crear(Tipo p) {
		// TODO Auto-generated method stub
		return up.save(p);
	}

	@Override
	public Tipo editar(Tipo p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tipo buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tipo> listar() {
		// TODO Auto-generated method stub
		return (List<Tipo>) up.findAll();
	}

}
