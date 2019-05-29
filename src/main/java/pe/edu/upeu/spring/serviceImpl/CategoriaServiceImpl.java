package pe.edu.upeu.spring.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring.dao.categoriaDao;
import pe.edu.upeu.spring.entities.documentos.Categoria;
import pe.edu.upeu.spring.service.CategoriaService;

@Service
@Transactional
public class CategoriaServiceImpl implements CategoriaService {
	
	
	@Autowired
	private categoriaDao categ;

	@Override
	public Categoria crear(Categoria pe) {
		try {
			return categ.save(pe);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Categoria> Lisall() {
		// TODO Auto-generated method stub
		return null;
	}

}
