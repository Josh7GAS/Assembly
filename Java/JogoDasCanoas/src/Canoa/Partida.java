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

	public Boolean terminou() {
		int contCanoaDestruida = 0;
		for (int count = 0; count < qtdJogadores; count++) {
			if(listaJogadores[count].getRio().canoaEstaDestruida()) {
				contCanoaDestruida++;
			}
		}
		
		return contCanoaDestruida == qtdJogadores || contCanoaDestruida == (qtdJogadores - 1);
	}

	public boolean empatou() {
		Boolean deuEmpate = false;

		for (Jogador jogador : listaJogadores) {
			if (jogador.getRio().canoaEstaDestruida()==false) {

				deuEmpate=true;
				System.out.println("Empatou");
			}
		}return deuEmpate;
	}

	public String alguemGanhou() {
		
		for (Jogador listaProcuraPeloGanhador : listaJogadores) {
			
			if (!listaProcuraPeloGanhador.getRio().canoaEstaDestruida()) {
				
				return listaProcuraPeloGanhador.getNomeJogador();
			}
		} return null;
	}
}
