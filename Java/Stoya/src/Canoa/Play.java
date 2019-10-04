package Canoa;

import java.util.Arrays;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prepara para receber os jogadores  
		Jogador[] listaJogadores = new Jogador[2];

		do {
			//cria os dois players
			listaJogadores[0] = new Jogador("Joshua", "zebulom", 4, 10);
			listaJogadores[1] = new Jogador("Joao", "naftali", 4, 10);

			listaJogadores[0].getRio().moveBarco(3);
			listaJogadores[1].getRio().moveBarco(7);

			listaJogadores[0].getRio().atiraNaCanoa(5);
			listaJogadores[1].getRio().atiraNaCanoa(5);



		} while(!listaJogadores[0].getRio().canoaEstaDestruida()&&!listaJogadores[1].getRio().canoaEstaDestruida());

		if (listaJogadores[0].getRio().canoaEstaDestruida()==false&&listaJogadores[1].getRio().canoaEstaDestruida()==false) {

			System.out.println("Deu empate");

		}else {

			if (listaJogadores[0].getRio().canoaEstaDestruida()==false) {
				System.out.println("P1 é campeão");

			}else {System.out.println("P2 é campeão");

			}


		}

	}

}
