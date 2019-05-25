package pe.edu.upeu.spring.entities.documentos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Gdetalle {

	@Id
	@Column(name="GT_ID")
	private Long id;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Column
	private String motivo;
	
	@Column
	private String destino;
	
	@Column
	private int total;
	
}
