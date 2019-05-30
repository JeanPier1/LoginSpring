package pe.edu.upeu.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.spring.entities.documentos.Mensaje;

public interface MensajeDao extends JpaRepository<Mensaje, Long> {

}
