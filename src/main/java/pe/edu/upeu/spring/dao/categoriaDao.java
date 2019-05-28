package pe.edu.upeu.spring.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.spring.entities.documentos.Categoria;


public interface categoriaDao extends JpaRepository<Categoria, Long> {

}
