package pe.edu.upeu.spring.entities.Login;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cuenta {
	
	@Id
	@Column(name="cue_id")
	private Long id;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="banco")
	private String banck;

}
