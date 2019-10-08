package br.com.bandtec.agendadeobjetivos.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="objetivos")
public class Objetivo {

	@Id
	@GeneratedValue
	private Long id;
	
	@Embedded
	@JsonProperty
	private ResumoDoObjetivo resumoDoObjetivo;
	
	@JsonProperty
	private LocalDate dataMaximaParaExecucao;
	
	@Embedded
	@JsonProperty
	private Prioridade prioridade;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "objetivo", cascade = CascadeType.ALL)
	private List<Impeditivo> impeditivos;
	
	
	
	public Objetivo() {}
	
	public Objetivo(ResumoDoObjetivo resumoDoObjetivo, 
			LocalDate dataMaximaParaExecucao, Prioridade prioridade) {
		super();
		this.resumoDoObjetivo = resumoDoObjetivo;
		this.dataMaximaParaExecucao = dataMaximaParaExecucao;
		this.prioridade = prioridade;
		this.impeditivos = new ArrayList<>();
	}

	
	@Override
	public String toString() {
		return "Objetivo [id=" + id + ", objetivo=" + resumoDoObjetivo + ", dataMaximaParaExecucao=" + dataMaximaParaExecucao
				+ ", prioridade=" + prioridade + ", impeditivos=" + impeditivos + "]";
	}

	public boolean ate(LocalDate data) {
		return dataMaximaParaExecucao.isBefore(data) || dataMaximaParaExecucao.isEqual(data);
	}

//	public Usuario getUsuario() {
//		return usuario;
//	}
//
//	public void associarA(Usuario usuario) {
//		this.usuario = usuario;
//	}

	public void adicionar(Impeditivo impeditivo) {
		this.impeditivos.add(impeditivo);
		impeditivo.setObjetivo(this);
	}
}
