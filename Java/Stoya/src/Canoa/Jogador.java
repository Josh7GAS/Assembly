package Canoa;

public class Jogador {
	private String nomeJogador;
	private Rio rio;
	Canoa canoa;
	
	
	public Jogador(String nomeJogador, String nomeCanoa, int tamanhoRio, int tamanhoCanoa ) {
		
		this.nomeJogador= nomeJogador;
		this.canoa = new Canoa("zebulom", 4);
		rio = new Rio(10, canoa);
		
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
	
	public int getTamanhoCanoaFromCanoa() {
		return canoa.tamanhoCanoa;
		
		 
	}
	

		
}