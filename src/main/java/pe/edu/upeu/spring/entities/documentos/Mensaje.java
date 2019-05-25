package pe.edu.upeu.spring.entities.documentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mensaje {

	@Id
	@Column(name="MEN_ID")
	private Long id;
	
	@Column
	private String mensaje;
	
}
