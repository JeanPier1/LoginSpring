package pe.edu.upeu.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.spring.entities.documentos.Informe;

public interface InformeDao extends JpaRepository<Informe, Long> {

}
