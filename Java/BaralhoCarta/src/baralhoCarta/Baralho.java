package baralhoCarta;

import java.util.Random;

public class Baralho {

	private int tamanho = 52;
	private PilhaObj<Carta> baralho;

	public Baralho() {
		this.baralho = new PilhaObj<>(tamanho);
		String[] faces = new String[]{"Ás", "1", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "Valete", "Dama", "Rei"};
		String[] naipes = new String[]{"Copas", "Paus", "Ouros", "Espadas"};

		while (!baralho.isFull()) {
			for (String face : faces) {
				for (String naipe : naipes) {
					Carta carta = new Carta(face, naipe);
					baralho.push(carta);
				}
			}

		}
		this.baralho = baralho;

	}

	public PilhaObj<Carta> getBaralho() {
		return baralho;
	}

	public void setBaralho(PilhaObj<Carta> baralho) {
		this.baralho = baralho;
	}

	public Carta removeCarta(int id) {
		PilhaObj<Carta> aux = new PilhaObj<Carta>(tamanho);
		for (int count = 0; count < id; count++) {
			aux.push(baralho.pop());
		}
		Carta alvo = baralho.pop();
		while (!aux.isFull()) {
			baralho.push(aux.pop());
		}
		return alvo;
	}

	public void embaralharar() {

		for (int count = 0; count < tamanho; count++) {

			Random aleatorio = new Random();
			int indice = aleatorio.nextInt(tamanho);

			if (indice != 0) {
				baralho.push(removeCarta(indice));

			}

		}

	}

	public Carta virarCarta() {
		baralho.pop();

		return baralho.peek();
	}


}//class
