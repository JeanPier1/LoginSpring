package pe.edu.upeu.spring.entities.documentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Nofacturado {

	@Id
	@Column(name="NF_ID")
	private Long id;
	
	@Column 
	private int colectivo;
	
	@Column
	private int taxi;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="GT_ID",nullable = false)
	private Gdetalle idgdetalle;
}
