package pe.edu.upeu.spring.entities;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="MAE_USER")
public class User {
	
	@Id
	private long id;
	
	private String usuario;
	
	private String passwoord;
	
	private Rol rolid;
	
	
	private Persona personaid;
}
