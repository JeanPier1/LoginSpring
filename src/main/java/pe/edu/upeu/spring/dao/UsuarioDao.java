package pe.edu.upeu.spring.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.spring.entities.Login.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {

}
