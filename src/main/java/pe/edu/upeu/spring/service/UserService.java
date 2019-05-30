package pe.edu.upeu.spring.service;

import java.util.List;

import pe.edu.upeu.spring.entities.Login.Usuario;

public interface UserService {
	Usuario crear(Usuario p);
	Usuario editar(Usuario p);
	void eliminar(Long id);
	Usuario buscar(Long id);
	List<Usuario> listar();
	
	Usuario findByUsuario( String  nombre,String password);

}
