package pe.edu.upeu.spring.entities.documentos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Informe {
	
	@Id
	@Column(name="INF_ID")
	private Long id;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Column
	private String proposito;
	
	@Column
	private String resumen;
	
}
