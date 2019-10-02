package Canoa;

public class Jogador {
	private String nomeJogador;
	private Rio rio;
	
	
	public Jogador(String nomeJogador, String nomeCanoa, int tamanhoRio, int tamanhoCanoa ) {
		
		this.nomeJogador= nomeJogador;
		Canoa canoa = new Canoa("zebulom", 4);
		rio = new Rio(10, getTamanhoCanoa());
		
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


	public void setRio(Rio rio) {
		this.rio = rio;
	}
	
	public Canoa getTamanhoCanoa() {
		return getTamanhoCanoa();
	}
		
}