package br.com.bandtec.AgendaDeObjetivos.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Opiniao {

	@JsonProperty
	private String nome;
	
	@JsonProperty
	private String texto;
}
