package pe.edu.upeu.spring.entities.documentos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Gastos {

	@Id
	@Column(name="GAST_ID")
	private Long id;
	
	@Column
	private String moneda;
	
	@Column
	private String arecosto;
	
	@Column
	private int codigo;
	
	@Column(name="FECHA")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	
}
