package pe.edu.upeu.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.spring.entities.documentos.Infgasto;

public interface InfGastos extends JpaRepository<Infgasto, Long> {

}
