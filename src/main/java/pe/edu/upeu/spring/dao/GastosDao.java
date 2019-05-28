package pe.edu.upeu.spring.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.spring.entities.documentos.Gastos;

public interface GastosDao extends JpaRepository<Gastos, Long> {

}
