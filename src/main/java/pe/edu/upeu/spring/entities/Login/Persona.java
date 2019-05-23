package pe.edu.upeu.spring.entities.Login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
	
	@Id
	@Column(name="per_id")
	private Long id;
	
	@Column(name="nomnbre")
	private String nombre;

	@Column(name="apellido")
	private String apellido;

	@Column(name="dni", length = 8)
	private String dni;

	@Column(name="cuentabancaria")
	private String cuentabancaria;
	
	@Column(name="imagen")
	private String imagen;
}
