package pe.edu.upeu.spring.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.spring.entities.documentos.Nofacturado;

public interface NofacturaDao extends JpaRepository<Nofacturado, Long> {

}
