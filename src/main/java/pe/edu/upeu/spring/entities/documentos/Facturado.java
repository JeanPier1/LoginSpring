package pe.edu.upeu.spring.entities.documentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Facturado {
	
	@Id
	@Column(name="PRU_ID")
	private Long id;
	@Column
	private int impuesto;
	
	@Column
	private int local;
	
	@Column
	private int interprovincial;
	
	@Column
	private int viatico;
	
	@Column
	private int hotel;
}
