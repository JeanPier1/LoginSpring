package pe.edu.upeu.spring.entities.Login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Sede {

	@Id
	@Column(name="area_id")
	private Long id;
	
	@Column(name="nomnbre")
	private String nombre;

	
}
