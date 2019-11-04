package br.com.bandtec.AgendaDeObjetivos.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Livro {
	@JsonProperty
	private String nome;
	@JsonProperty
	private String tema;
}
