package pe.edu.upeu.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.spring.entities.documentos.Presupuesto;

public interface PrepuestoDao extends JpaRepository<Presupuesto, Long>{

}
