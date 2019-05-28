package pe.edu.upeu.spring.entities.documentos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import pe.edu.upeu.spring.entities.Login.Usuario;

@Entity
public class Gastos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="USU_ID",nullable = false)
	private Usuario idusuario;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="TIP_ID",nullable = false)
	private Tipo idtipo;
}
