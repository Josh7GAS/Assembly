package br.com.bandtec.agendadeobjetivos.domain;

public class Impeditivo {
	
	private String nome;
	
	private String motivo;
	
	private Objetivo objetivo;
	
	public Impeditivo() {}

	public Impeditivo(String nome, String motivo) {
		super();
		this.nome = nome;
		this.motivo = motivo;
	}

	void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}
}
