package pe.edu.upeu.spring.entities.documentos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import pe.edu.upeu.spring.entities.Login.Usuario;

@Entity
public class Viaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="VIA_ID")
	private Long id;
	
	
	@Column
	private String motivo;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date fechainicio;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date fechafin;
	
	@Column
	private int presupuesto;
	
	@Column(columnDefinition = "char")
	private String estado;
	
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="USU_ID",nullable = false)
	private Usuario idusuario;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public Date getFechainicio() {
		return fechainicio;
	}


	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}


	public Date getFechafin() {
		return fechafin;
	}


	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}


	public int getPresupuesto() {
		return presupuesto;
	}


	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Usuario getIdusuario() {
		return idusuario;
	}


	public void setIdusuario(Usuario idusuario) {
		this.idusuario = idusuario;
	}


	public Viaje() {
		super();
	}


	public Viaje(String motivo, Date fechainicio, Date fechafin, int presupuesto, String estado, Usuario idusuario) {
		super();
		this.motivo = motivo;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.presupuesto = presupuesto;
		this.estado = estado;
		this.idusuario = idusuario;
	}


	public Viaje(Long id, String motivo, Date fechainicio, Date fechafin, int presupuesto, String estado,
			Usuario idusuario) {
		super();
		this.id = id;
		this.motivo = motivo;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.presupuesto = presupuesto;
		this.estado = estado;
		this.idusuario = idusuario;
	}
	
	
	
}
