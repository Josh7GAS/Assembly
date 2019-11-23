package joshuaac3;

import java.util.Arrays;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int vetorV[] = new int[10];
		FilaPilha filaPilha = new FilaPilha(10);

		Scanner leitor = new Scanner(System.in);
		System.out.println("Me de 10 numeros");
		for (int count = 0; count < 10; count++) {
			System.out.println("numero" + count + "°");
			vetorV[count] = leitor.nextInt();

			if (vetorV[count] < 0) {
				filaPilha.push(vetorV[count]);
			} else {
				filaPilha.insert(vetorV[count]);
			}
		}
		System.out.println(Arrays.toString(vetorV));
		filaPilha.exibeFila();
		filaPilha.exibePilha();
		System.out.println();

		
		for (int countFila = 0; countFila < filaPilha.tamanhoConjunto; countFila++) {
			if (vetorV[countFila]>0) {
			filaPilha.pool();	
			}
			
		}
		filaPilha.exibeFila();
		
		for (int countPilha = 0; countPilha < filaPilha.topoPilha; countPilha++) {
			filaPilha.pop();
		}
		filaPilha.exibePilha();
	}//class
}
