package pe.edu.upeu.spring.entities.documentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nofacturado {

	@Id
	@Column(name="NF_ID")
	private Long id;
	
	@Column 
	private int colectivo;
	
	@Column
	private int taxi;
}
