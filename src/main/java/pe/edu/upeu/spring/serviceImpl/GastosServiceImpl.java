package pe.edu.upeu.spring.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring.dao.GastosDao;
import pe.edu.upeu.spring.entities.documentos.Gastos;
import pe.edu.upeu.spring.service.GastosService;
@Service
@Transactional
public class GastosServiceImpl implements GastosService{

	@Autowired
	private GastosDao gd;

	@Override
	public Gastos crear(Gastos pe) {
		// TODO Auto-generated method stub
		return gd.save(pe);
	}

	@Override
	public Gastos editar(Gastos per) {
		try {
			return gd.save(per);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Gastos buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gastos> listar() {
		// TODO Auto-generated method stub
		try {
			return (List<Gastos>)gd.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	}
