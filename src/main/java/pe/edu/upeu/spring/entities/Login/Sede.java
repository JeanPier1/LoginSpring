package pe.edu.upeu.spring.entities.Login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Sede {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="se_id")
	private Long id;
	
	@Column(name="nomnbre")
	private String nombre;

	
}
