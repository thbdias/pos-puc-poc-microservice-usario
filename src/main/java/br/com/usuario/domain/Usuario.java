package br.com.usuario.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Usuario {
	
	private String nome;
	
	private String alias;
	
	private String email;
	
	private String senha;
	
	private LocalDate createAt;

}
