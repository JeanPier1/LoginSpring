package pe.edu.upeu.spring.entities.documentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name	="inf_gasto")
public class Infgasto {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="IG_ID")
	 private Long id;
	 
	 @NotFound(action = NotFoundAction.IGNORE)
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="GAST_ID",nullable = false)
	 private Gastos idgastos;
	 
	 @NotFound(action = NotFoundAction.IGNORE)
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="INF_ID",nullable = false)
	 private Informe idinforme;
}
