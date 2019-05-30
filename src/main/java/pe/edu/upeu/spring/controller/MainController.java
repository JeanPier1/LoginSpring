package pe.edu.upeu.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.spring.entities.Login.Usuario;
import pe.edu.upeu.spring.entities.documentos.Gastos;
import pe.edu.upeu.spring.entities.documentos.Pasajes;
import pe.edu.upeu.spring.entities.documentos.Viaje;
import pe.edu.upeu.spring.service.GastosService;
import pe.edu.upeu.spring.service.PasajesService;
import pe.edu.upeu.spring.service.UserService;
import pe.edu.upeu.spring.service.ViajeService;

@RestController
@RequestMapping("/login")
public class MainController {
	

	
	@Autowired
	private GastosService gasser;
	
	@Autowired
	private PasajesService pasje;
	
	@Autowired
	private ViajeService visje;
	
	@PostMapping("/crearGastos")
		public ResponseEntity<?> crearGastos(@RequestBody Gastos g){
		Gastos gas=null;
		Map<String, Object> response = new  HashMap<>();
		gas= gasser.crear(g);
		return new ResponseEntity<Map<String, Object>>(response ,HttpStatus.CREATED);
	}

	@PostMapping("/crearviaje")
	public ResponseEntity<?> crearViaje(@RequestBody Viaje pas){
		Map<String, Object> response = new  HashMap<>();
		visje.crear(pas);
		return new ResponseEntity<Map<String, Object>>(response ,HttpStatus.CREATED);		
	}
	
	@PostMapping("/crearPasaje")
	public ResponseEntity<?> crearPasajes(@RequestBody Pasajes pass){
		Map<String, Object> response = new  HashMap<>();
		pasje.crear(pass);
		return new ResponseEntity<Map<String, Object>>(response ,HttpStatus.CREATED);		
	}
	
	
}
