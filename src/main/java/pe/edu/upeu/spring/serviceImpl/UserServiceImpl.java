package pe.edu.upeu.spring.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.spring.dao.UsuarioDao;

import pe.edu.upeu.spring.entities.Login.Usuario;
import pe.edu.upeu.spring.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements  /*UserDetailsService*/UserService {
	
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

	public Usuario findByUsername(String username) {
		return us.findByUsername(username);
	}

	//Metodo de Login
	
//	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class); 
	
//	@Override
//	@Transactional(readOnly = true)
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub}
//		Usuario user=us.findByUsername(username);
//
//		
//		if(user == null) {
//			logger.error("ERROR LOGIN" + username);
//			throw new UsernameNotFoundException("ERROR LOGION "+ username);
//		}
//		List<GrantedAuthority> authorities = user.getRoles()
//				.stream()
//				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
//				.peek(authority -> logger.info("Role: "+ authority.getAuthority()))
//				.collect(Collectors.toList());
//		return new User(user.getUsername(), user.getPassword(), user.getEnable(), true, true, true, authorities);
//	}

	
	

}
