package pe.edu.upeu.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.spring.entities.documentos.Actividades;
import pe.edu.upeu.spring.entities.documentos.Categoria;
import pe.edu.upeu.spring.entities.documentos.Gastos;
import pe.edu.upeu.spring.entities.documentos.Pasajes;
import pe.edu.upeu.spring.entities.documentos.Pdetalle;
import pe.edu.upeu.spring.entities.documentos.Presupuesto;
import pe.edu.upeu.spring.entities.documentos.Viaje;
import pe.edu.upeu.spring.service.ActividadService;
import pe.edu.upeu.spring.service.CategoriaService;
import pe.edu.upeu.spring.service.GastosService;
import pe.edu.upeu.spring.service.PasajesService;
import pe.edu.upeu.spring.service.PdetalleService;
import pe.edu.upeu.spring.service.PresupuestoService;
import pe.edu.upeu.spring.service.ViajeService;

@RestController
@RequestMapping("/entro")
public class MainController {
	
	
	
	@Autowired
	private GastosService gasser;
	
	@Autowired
	private PasajesService pasje;
	
	@Autowired
	private ViajeService visje;
	
	
	@Autowired
	private PdetalleService pdser;
	
	@Autowired
	private CategoriaService cateser;
	
	@Autowired
	private ActividadService actvidaes;
	
	@Autowired
	private PresupuestoService presu;
	
		
	
	
	@GetMapping("/listGastos")
	public List<Gastos> nuevo(){
		
		return gasser.listar();
	}
	
	@PostMapping("/crearGastos")
		public Gastos crearGastos(@RequestBody Gastos g){
		return gasser.crear(g);
	}
	
	@GetMapping("/listviaje")
	public List<Viaje> nuevo2(){
		
		return visje.readll();
	}

	@PostMapping("/crearviaje")
	public Viaje crearViaje(@RequestBody Viaje pas){
		return visje.crear(pas);
	}
	
	@PostMapping("/crearPasaje")
	public Pasajes crearPasajes(@RequestBody Pasajes pass){
		return pasje.crear(pass);
	}
	
	@PostMapping("/crearcategoria")
	public ResponseEntity<?> crearcate(@RequestBody Categoria cat){
		Map<String, Object> response = new  HashMap<>();
		cateser.crear(cat);
		return new ResponseEntity<Map<String, Object>>(response ,HttpStatus.CREATED);		
	}
	
	@PostMapping("/crearPdetalle")
	public ResponseEntity<?> crear(@RequestBody Pdetalle pdet){
		Map<String, Object> response = new  HashMap<>();
		pdser.crear(pdet);
		return new ResponseEntity<Map<String, Object>>(response ,HttpStatus.CREATED);		
	}
	
	@PostMapping("/crearactivid")
	public ResponseEntity<?> crearact(@RequestBody Actividades ac){
		Map<String, Object> response = new  HashMap<>();
		actvidaes.crear(ac);
		return new ResponseEntity<Map<String, Object>>(response ,HttpStatus.CREATED);		
	}
	
	@PostMapping("/crearPresupuesto")
	public Presupuesto crearPro(@RequestBody Presupuesto pres){
		return presu.crear(pres);
	}
}
