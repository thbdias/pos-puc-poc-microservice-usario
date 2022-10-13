package br.com.usuario.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usuario.domain.Usuario;
import br.com.usuario.dto.UsuarioDTO;
import br.com.usuario.repository.UsuarioRepository;
import br.com.usuario.util.UsarioAdapter;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public UsuarioDTO save(UsuarioDTO usuarioDTO) {
		
		Usuario usuario = UsarioAdapter.adapt(usuarioDTO);
		
		usuario.setSenha(usuario.getSenha());
		usuario.setCreateAt(LocalDate.now());
		
		return UsarioAdapter.adapt(usuarioRepository.save(usuario));
	}

}
