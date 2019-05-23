package pe.edu.upeu.spring.entities.Login;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


@Entity
public class Usuario {

	@Id
	@Column(name="usu_id")
	private Long id;
	
	@Column(name="nomnbre")
	private String nombre;

	@Column(name="password")
	private String password;
	
	@Temporal(TemporalType.DATE)	
	private Date fecha;
	
	@Column(name="estado", columnDefinition = "char")
	private String estado;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="per_id",nullable = false)
	private Persona idpersona;
}
