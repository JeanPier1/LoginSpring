package pe.edu.upeu.spring.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.spring.dao.UsuarioDao;
import pe.edu.upeu.spring.entities.Login.Usuario;
import pe.edu.upeu.spring.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UsuarioDao us;
	@Override
	public Usuario crear(Usuario p) {
		// TODO Auto-generated method stub
		try {
			return us.save(p);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Usuario editar(Usuario p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listar() {
		try {
			return (List<Usuario>) us.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		return null;
	}

	

}
