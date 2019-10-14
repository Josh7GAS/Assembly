package Canoa;

public class Partida {
	int qtdJogadores;
	Rio rio;
	Jogador jogador;
	Jogador [] listaJogadores;

	public Partida() {
		super();
		this.qtdJogadores = qtdJogadores;
		this.listaJogadores = new Jogador[qtdJogadores];
	}

	public int getQtdJogadores() {
		return qtdJogadores;
	}

	public void setQtdJogadores(int qtdJogadores) {
		this.qtdJogadores = qtdJogadores;
	}

	public Jogador getJogador(int jogadorAtual) {
		return listaJogadores[jogadorAtual];
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Jogador[] getListaJogadores() {
		return listaJogadores;
	}

	public void setListaJogadores(Jogador[] listaJogadores) {
		this.listaJogadores = listaJogadores;
	}

	public Rio getRioFromPartida() {
		return rio;
	}

	public void addJogador(Jogador jogadorTemp) {
		for (int count = 0; count < qtdJogadores; count++) {
			System.out.println("Adicionando Jogador: "+ count);
			listaJogadores[count]=jogadorTemp;

		}
	}

	
	
	public boolean terminou() {
		Boolean estaDestruida= false;

		for(boolean cadaIndex : getRioFromPartida().getRio()) {
			if(cadaIndex==false) {
				estaDestruida=true;
			}else {

				return estaDestruida;
			}

		}return estaDestruida;

	}
	
	public boolean empatou() {
		for (Jogador jogador : listaJogadores) {
			if (jogador.getRio()) {
				System.out.println("Empatou");
			}
		}	
	}


}
