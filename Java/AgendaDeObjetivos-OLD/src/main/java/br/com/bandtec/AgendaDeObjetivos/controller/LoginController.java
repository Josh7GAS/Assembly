package br.com.bandtec.AgendaDeObjetivos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bandtec.AgendaDeObjetivos.domain.Credenciais;
import br.com.bandtec.AgendaDeObjetivos.domain.TodosUsuarios;

@RestController
public class LoginController {
	
	private TodosUsuarios listaUsuarios;
	
	@Autowired
	public LoginController(TodosUsuarios listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}	
		
	@PostMapping("/login")
	public ResponseEntity<String> validarLogin(@RequestBody Credenciais credendicais) {
		if (listaUsuarios.existe(credendicais) != null) {
			return ResponseEntity.ok("Login efetuado com sucesso");
		}
		
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Erro! Usuário ou senha inexistentes!!");
	}
	
	
	
}
