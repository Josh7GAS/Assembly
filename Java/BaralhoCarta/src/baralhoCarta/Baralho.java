package baralhoCarta;


// <editor-fold defaultstate="collapsed" desc="imports...">
import java.util.Random;
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 *
 * Description: ...
 *
 * @version 1.0.0
 * @author WINDOWS 8.1 JOSHUA, 20/11/2019, 23:19:38 Last update: -
 */// </editor-fold>
public class Baralho {

	private PilhaObj<Carta> baralho;

	public Baralho() {
		this.baralho = new PilhaObj<Carta>(52);
		String[] faces = new String[]{"Ás", "1", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "Valete", "Dama", "Rei"};
		String[] naipes = new String[]{"Copas", "Paus", "Ouros", "Espadas"};

		while (baralho.isFull()) {
			for (int countFaces = 0; countFaces < faces.length; countFaces++) {
				for (int countNaipe = 0; countNaipe < naipes.length; countNaipe++) {
					Carta carta = new Carta(faces[countFaces], naipes[countNaipe]);
					baralho.push(carta);

				}

			}
		}

		System.out.println(baralho);

	}

	public PilhaObj<Carta> getBaralho() {
		return baralho;
	}

	public void setBaralho(PilhaObj<Carta> baralho) {
		this.baralho = baralho;
	}

	public Carta removeCarta(int id) {
		PilhaObj<Carta> aux = new PilhaObj<Carta>(52);
		for (int count = 0; count < id; count++) {
			aux.push(baralho.pop());
		}
		Carta alvo = baralho.pop();
		while (aux.isFull()) {
			baralho.push(aux.pop());
		}
		return alvo;
	}

	public void embaralharar() {

		for (int count = 0; count < 52; count++) {

			Random aleatorio = new Random();
			int indice = aleatorio.nextInt(52);

			if (indice != 0) {
				Carta carta = removeCarta(indice);
				baralho.push(carta);

			}

		}

	}

	public Carta virarCarta() {
		baralho.pop();

		return baralho.peek();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+"[ + name]
	}

}//class
