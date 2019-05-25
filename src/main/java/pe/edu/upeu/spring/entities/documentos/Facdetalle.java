package pe.edu.upeu.spring.entities.documentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Facdetalle {
	
	@Id
	@Column(name="FACD_ID")
	private Long id;
	
	@Column(name="IMAGEN")
	private String imagen;
}
