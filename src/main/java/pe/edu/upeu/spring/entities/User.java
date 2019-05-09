package pe.edu.upeu.spring.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MAE_USER")
public class User {
	
	@Column(name="USU_ID")
	@Id
	private long id;
	
	@Column(name="NOMBRE")
	private String usuario;
	
	@Column(name="PASSWORD")
	private String passwoord;
	
	@Column(name="FECHA")
	private Date Fecha;
	
	
	@Column(name="ESTADO")
	private String estado;
	
	@Column(name="PER_ID")
	private Persona idpersona;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPasswoord() {
		return passwoord;
	}
	public void setPasswoord(String passwoord) {
		this.passwoord = passwoord;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Persona getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(Persona idpersona) {
		this.idpersona = idpersona;
	}
	
	public User() {
		super();
	}
	
	public User(String usuario, String passwoord, Date fecha, String estado, Persona idpersona) {
		super();
		this.usuario = usuario;
		this.passwoord = passwoord;
		Fecha = fecha;
		this.estado = estado;
		this.idpersona = idpersona;
	}
	public User(long id, String usuario, String passwoord, Date fecha, String estado, Persona idpersona) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.passwoord = passwoord;
		Fecha = fecha;
		this.estado = estado;
		this.idpersona = idpersona;
	}






}
