package pe.edu.upeu.spring.entities.documentos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Viaje {

	@Id
	@Column(name="VIA_ID")
	private Long id;
	
	
	@Column
	private String motivo;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date fechainicio;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date fechafin;
	
	@Column
	private int presupuesto;
	
	@Column(columnDefinition = "char")
	private String estado;
	
}
