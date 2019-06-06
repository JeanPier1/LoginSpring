package pe.edu.upeu.spring.entities.documentos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pasajes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PAS_ID")
	private Long id;
	
	@Column
	private String origen;
	@Column
	private String destino;
	@Column
	@Temporal(TemporalType.DATE)
	private Date fechainicio;
	@Column
	private String horainicio;
	@Column
	@Temporal(TemporalType.DATE)
	private Date fechafin;
	@Column
	private String horafin;
	@Column
	private String transporte;
	@Column
	private String numero;
	@Column
	private Double precio;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Date getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}
	public String getHorainicio() {
		return horainicio;
	}
	public void setHorainicio(String horainicio) {
		this.horainicio = horainicio;
	}
	public Date getFechafin() {
		return fechafin;
	}
	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	public String getHorafin() {
		return horafin;
	}
	public void setHorafin(String horafin) {
		this.horafin = horafin;
	}
	public String getTransporte() {
		return transporte;
	}
	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Pasajes() {
		super();
	}
	public Pasajes(String origen, String destino, Date fechainicio, String horainicio, Date fechafin, String horafin,
			String transporte, String numero, Double precio) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.fechainicio = fechainicio;
		this.horainicio = horainicio;
		this.fechafin = fechafin;
		this.horafin = horafin;
		this.transporte = transporte;
		this.numero = numero;
		this.precio = precio;
	}
	public Pasajes(Long id, String origen, String destino, Date fechainicio, String horainicio, Date fechafin,
			String horafin, String transporte, String numero, Double precio) {
		super();
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.fechainicio = fechainicio;
		this.horainicio = horainicio;
		this.fechafin = fechafin;
		this.horafin = horafin;
		this.transporte = transporte;
		this.numero = numero;
		this.precio = precio;
	}
	
	
}
