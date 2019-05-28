package pe.edu.upeu.spring.entities.Login;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Area {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="area_id")
	private Long id;
	
	@Column(name="nomnbre")
	private String nombre;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha")
	private Date fecha;
}
