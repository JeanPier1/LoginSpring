package pe.edu.upeu.spring.entities.Login;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;



@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usu_id")
	private Long id;
	
	@Column(name="username")
	private String username;

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

	private Boolean enable;

	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="users_authorities", joinColumns = @JoinColumn(name="user_id"), 
	inverseJoinColumns = @JoinColumn(name="role_id"),
	uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id"})})
	private List<Rol> roles;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
	
	

	public List<Rol> getRoles() {
		return roles;
	}

	
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	
}
