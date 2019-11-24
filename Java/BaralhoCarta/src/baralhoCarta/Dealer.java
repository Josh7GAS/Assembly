package baralhoCarta;

import java.util.Scanner;

public class Dealer {

	// <editor-fold defaultstate="collapsed" desc="static fields...">
	public static Scanner scanner = new Scanner(System.in);
	// </editor-fold>

	// <editor-fold desc="executable method...">
	public static void main(String[] args) {

		//1. Crie um objeto da classe baralho
		Baralho carteado = new Baralho();
//
//		//2. Mostre as Cartas do baralho
		System.out.println(carteado.getBaralho());;
//
//		//3.Embaralhe as Cartas
		carteado.embaralharar();
		//4. Mostre novamente as cartas
		System.out.println(carteado);
//		//5. Embaralhe as Cartas novamente
		carteado.embaralharar();
//		//6.digite um numero d 1 a 11
		Scanner leitor = new Scanner(System.in);
		System.out.println("Me de um número entre 1 e 11");
		int numero = leitor.nextInt();
		while (numero > 11 && numero < 1) {
			System.out.println("Valor invalido");
		}
		//7.Adivinhe quantascartas vermelhas a no baralho		System.out.println("Adivinhe quantas cartas vermelhas tem no baralho");
		int numero2 = leitor.nextInt();
		while (numero2 < 0 && numero2 < numero) {
			System.out.println("Digite um valor que 0 (zero) e menor do que"
					+ " você digitou anteriormente");
		}
		//8.Vire a quantidade de cartas que o usuario solicitou

		Carta[] cartasViradas = null;
		Carta virando = carteado.virarCarta();
		int somaCartasVermelhas = 0;

		for (int count = 0; count < numero; count++) {
			System.out.println(virando);

			cartasViradas[count] = virando;
	}

//		//9.Exiba se ganhou ou perdeu
		for (int count = 0; count < numero; count++) {
			if (cartasViradas[count].getNaipe() == "Copas"
					|| cartasViradas[count].getNaipe() == "Ouros") {
				somaCartasVermelhas++;

			}
		}

		if (somaCartasVermelhas == numero2) {
			System.out.println("Voce ganhou");
		} else {
			System.out.println("Voce Perdeu");
		}

	}

	}//class