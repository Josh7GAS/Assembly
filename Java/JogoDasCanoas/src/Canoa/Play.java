package Canoa;


public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prepara para receber os jogadores  
		Jogador[] listaJogadores = new Jogador[2];

		
		listaJogadores[0] = new Jogador("Joshua", "zebulom", 4, 10);
		listaJogadores[1] = new Jogador("Joao", "naftali", 4, 10);
		
		

		System.out.println(listaJogadores[0].getRio().tamanhoRio);

	}
}