package pe.edu.upeu.spring.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.spring.entities.documentos.Facturado;

public interface FacturadoDao extends JpaRepository<Facturado, Long>{


}
