package pe.edu.upeu.spring.entities.Login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="per_id")
	private Long id;
	
	@Column(name="username")
	private String username;

	@Column(name="apellido")
	private String apellido;

	@Column(name="dni", length = 8)
	private String dni;

	@Column(name="cuentabancaria")
	private String cuentabancaria;
	
	@Column(name="imagen")
	private String imagen;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCuentabancaria() {
		return cuentabancaria;
	}

	public void setCuentabancaria(String cuentabancaria) {
		this.cuentabancaria = cuentabancaria;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Persona() {
		super();
	}

	public Persona(String username, String apellido, String dni, String cuentabancaria, String imagen) {
		super();
		this.username = username;
		this.apellido = apellido;
		this.dni = dni;
		this.cuentabancaria = cuentabancaria;
		this.imagen = imagen;
	}

	public Persona(Long id, String username, String apellido, String dni, String cuentabancaria, String imagen) {
		super();
		this.id = id;
		this.username = username;
		this.apellido = apellido;
		this.dni = dni;
		this.cuentabancaria = cuentabancaria;
		this.imagen = imagen;
	}
	
}
