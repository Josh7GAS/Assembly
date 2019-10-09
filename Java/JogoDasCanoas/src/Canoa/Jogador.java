package Canoa;

public class Jogador {
	private String nomeJogador;
	private Rio rio;
	private Canoa canoa;


	public Jogador(String nomeJogador, String nomeCanoa, int tamanhoRio, int tamanhoCanoa ) {

		this.nomeJogador= nomeJogador;
		this.canoa = new Canoa(nomeCanoa, tamanhoCanoa);
		rio = new Rio(tamanhoRio, canoa);
		

	}


	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public Rio getRio() {


		return rio;
	}


	public Canoa getCanoa() {
		return canoa;
	}


	@Override
	public String toString() {
		return "Jogador [nomeJogador=" + nomeJogador + ", rio=" + getRio() + ", canoa=" + getCanoa() + "]";
	}







}