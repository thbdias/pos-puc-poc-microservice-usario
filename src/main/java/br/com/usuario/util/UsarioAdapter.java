package br.com.usuario.util;

import org.modelmapper.ModelMapper;

import br.com.usuario.domain.Usuario;
import br.com.usuario.dto.UsuarioDTO;

public class UsarioAdapter {
	
	private static ModelMapper mapper = new ModelMapper();
	
	public static Usuario adapt (UsuarioDTO usuarioDTO) {
		return mapper.map(usuarioDTO, Usuario.class);
	}

}
