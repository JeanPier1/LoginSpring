package pe.edu.upeu.spring.entities.documentos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class MvDetalle {
	
	@Id
	@Column(name="ENV_ID")
	private Long id;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	
	@Column
	@Temporal(TemporalType.TIME)
	private Date hora;

}
