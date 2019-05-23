package pe.edu.upeu.spring.entities.Login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rol {
	@Id
	@Column(name="rol_id")
	private Long id;
	
	@Column(name="nomnbre")
	private String nombre;



}
