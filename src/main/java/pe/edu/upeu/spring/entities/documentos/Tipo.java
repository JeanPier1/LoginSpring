package pe.edu.upeu.spring.entities.documentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tipo {
	
	@Id
	@Column(name="TIP_IDS")
	private Long id;
	
	@Column
	private String nombre;
}
