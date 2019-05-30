package pe.edu.upeu.spring.entities.documentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TIP_IDS")
	private Long id;
	
	@Column
	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo() {
		super();
	}

	public Tipo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Tipo(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	
}
