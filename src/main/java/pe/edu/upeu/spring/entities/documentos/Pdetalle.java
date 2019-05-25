package pe.edu.upeu.spring.entities.documentos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pdetalle {
	
	@Id
	@Column(name="PD_ID")
	private Long id;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date fecha;

	
}
