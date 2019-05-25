package pe.edu.upeu.spring.entities.documentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Presupuesto {

	@Id
	@Column
	private Long id;
	
	
	@Column
	private String detalle;
	
	
	@Column
	private int total;
}
