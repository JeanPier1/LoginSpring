package pe.edu.upeu.spring.entities.Login;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


@Entity
@Table(name="usua_rol")
public class Usua_rol {

	@Id
	@Column(name="pl_id")
	private Long id;
	
	@Temporal(TemporalType.DATE)	
	@Column(name="fecha")
	private Date fecha;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="usu_id",nullable = false)
	private Usuario idusuario;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="sa_rol_id",nullable = false)
	private Usuario sa_rol_id;
}
