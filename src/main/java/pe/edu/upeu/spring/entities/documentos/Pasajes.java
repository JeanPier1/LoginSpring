package pe.edu.upeu.spring.entities.documentos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pasajes {

	@Id
	@Column(name="PAS_ID")
	private Long id;
	
	@Column
	private String origen;
	@Column
	private String destino;
	@Column
	@Temporal(TemporalType.DATE)
	private Date fechainicio;
	@Column
	@Temporal(TemporalType.TIME)
	private Date horainicio;
	@Column
	@Temporal(TemporalType.DATE)
	private Date fechafin;
	@Column
	@Temporal(TemporalType.TIME)
	private Date horafin;
	@Column
	private String transporte;
	@Column
	private String numero;
	@Column
	private Double precio;
}
