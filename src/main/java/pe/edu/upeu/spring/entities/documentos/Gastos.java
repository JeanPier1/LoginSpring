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
public class Gastos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="GAST_ID")
	private Long id;
	
	@Column
	private String moneda;
	
	@Column
	private String arecosto;
	
	@Column
	private int codigo;
	
	@Column(name="FECHA")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="USU_ID",nullable = false)
	private Usuario idusuario;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="TIP_ID",nullable = false)
	private Tipo idtipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getArecosto() {
		return arecosto;
	}

	public void setArecosto(String arecosto) {
		this.arecosto = arecosto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Usuario getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Usuario idusuario) {
		this.idusuario = idusuario;
	}

	public Tipo getIdtipo() {
		return idtipo;
	}

	public void setIdtipo(Tipo idtipo) {
		this.idtipo = idtipo;
	}

	public Gastos() {
		super();
	}

	public Gastos(String moneda, String arecosto, int codigo, Date fecha, Usuario idusuario, Tipo idtipo) {
		super();
		this.moneda = moneda;
		this.arecosto = arecosto;
		this.codigo = codigo;
		this.fecha = fecha;
		this.idusuario = idusuario;
		this.idtipo = idtipo;
	}

	public Gastos(Long id, String moneda, String arecosto, int codigo, Date fecha, Usuario idusuario, Tipo idtipo) {
		super();
		this.id = id;
		this.moneda = moneda;
		this.arecosto = arecosto;
		this.codigo = codigo;
		this.fecha = fecha;
		this.idusuario = idusuario;
		this.idtipo = idtipo;
	}
	
	
}
