package br.com.usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.usuario.dto.UsuarioDTO;
import br.com.usuario.service.UsuarioService;

@RestController
@RequestMapping
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/save")
	public String cadastrar(@RequestBody UsuarioDTO usuarioDTO) {
		return usuarioService.save(usuarioDTO);		
	}

}
