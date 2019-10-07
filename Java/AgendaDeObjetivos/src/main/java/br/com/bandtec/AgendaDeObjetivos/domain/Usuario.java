package br.com.bandtec.AgendaDeObjetivos.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	@JsonProperty
	private Long id;
	
	@JsonProperty
	@Embedded
	private Credenciais credenciais;
	
//	@JsonProperty
//	private String login;
//	
//	@JsonProperty
//	private String senha;
//	
	@JsonProperty
	private String nome;
	
	@JsonProperty
	private Integer idade;
	
	public Usuario() {}
	
//	public Usuario(String nome, Integer idade) {
//		this.nome = nome;
//		this.idade = idade;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public String getLogin() {
//		return credenciais.getLogin();
//	}
//
//	public void setLogin(String login) {
//		credenciais.setLogin(login);
//	}
//
//	public String getSenha() {
//		return credenciais.getSenha();
//	}
//
//	public void setSenha(String senha) {
//		credenciais.setSenha(senha);
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Credenciais getCredenciais() {
		return credenciais;
	}
	
	public void setCredenciais(Credenciais credenciais) {
		this.credenciais = credenciais;
	}
	
//	public static boolean validar(Usuario objetoAvaliado) {
//		return 	objetoAvaliado.nome != null &&
//				objetoAvaliado.idade != null;
//	}
	
}
