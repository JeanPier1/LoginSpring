package pe.edu.upeu.spring.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.spring.entities.documentos.Tipo;


public interface TipoDao extends JpaRepository <Tipo, Long> {

}
