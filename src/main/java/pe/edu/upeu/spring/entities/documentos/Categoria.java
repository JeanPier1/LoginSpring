package pe.edu.upeu.spring.entities.documentos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Categoria {
	
	@Id
	@Column(name="CAT_ID")
	private Long id;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="FECHA")
	@Temporal(TemporalType.DATE)
	private Date fecha;
}
