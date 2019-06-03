package pe.edu.upeu.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.spring.entities.Login.Usuario;
import pe.edu.upeu.spring.service.UserService;

@RestController
@RequestMapping("/login")
public class UsuarioController {
	
	@Autowired
	private UserService userde;
	
	
	@GetMapping("/lista")
	public List<Usuario> liatr(){
		
		return userde.listar();
	}
}
