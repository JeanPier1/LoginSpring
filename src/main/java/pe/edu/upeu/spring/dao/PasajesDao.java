package pe.edu.upeu.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.spring.entities.documentos.Pasajes;

public interface PasajesDao extends JpaRepository<Pasajes, Long> {

}
