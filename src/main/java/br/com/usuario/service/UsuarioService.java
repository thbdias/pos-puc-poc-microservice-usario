package br.com.usuario.service;

import org.springframework.stereotype.Service;

import br.com.usuario.domain.Usuario;
import br.com.usuario.dto.UsuarioDTO;
import br.com.usuario.util.UsarioAdapter;

@Service
public class UsuarioService {
	
	public String save(UsuarioDTO usuarioDTO) {
		
		Usuario usuario = UsarioAdapter.adapt(usuarioDTO);
		
		usuario.setSenha(usuario.getSenha() + "+999");
		
		return usuario.toString();
	}

}
