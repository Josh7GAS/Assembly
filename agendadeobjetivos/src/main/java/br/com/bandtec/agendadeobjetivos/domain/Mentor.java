package br.com.bandtec.agendadeobjetivos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="mentores")
public class Mentor {

	@Id
	@GeneratedValue
	private Long id;

	@JsonProperty
	private String nome;

	@JsonProperty
	private String profissao;

	public Mentor(String nome, String profissao) {
		super();
		this.nome = nome;
		this.profissao = profissao;
	}
	
	public Mentor() {}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getProfissao() {
		return profissao;
	}



	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}


	public Long getId() {
		return id;
	}


}
