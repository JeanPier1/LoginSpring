package pe.edu.upeu.spring.entities.documentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Infgasto {

	 @Id
	 @Column(name="IG_ID")
	 private Long id;
}
