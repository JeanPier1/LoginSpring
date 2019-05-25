package pe.edu.upeu.spring.entities.documentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actividades {
	
	@Id
	@Column(name="ACT_ID")
	private long id;
	
	@Column
	private String nombre;
	
	
	
}

