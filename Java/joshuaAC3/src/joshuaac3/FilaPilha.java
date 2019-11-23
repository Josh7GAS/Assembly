package joshuaac3;

public class FilaPilha {
	//ATRIBUTOS FILA

	int tamanhoFila;

	//ATRIBUTOS PILHA
	 int topoPilha;

	//ATRIBUTO CONJUNTO
	 int[] vetorConjunto;
	 int tamanhoConjunto;

	public FilaPilha(int tamanhoConjunto) {
		this.tamanhoFila = tamanhoFila;
		this.topoPilha = -1;
		this.tamanhoConjunto = tamanhoConjunto;
		this.vetorConjunto = new int[tamanhoConjunto];

	}

//	boolean vetorConjuntoIsEmpity() {
//		return (tamanhoConjunto == 0);
//	}
	//ESTA VAZIO FILA?
	boolean isFilaEmpty() {
		return (tamanhoFila == 0);
	}

	//ESTA VAZIO PILHA?
	private boolean isPilhaEmpty() {
		return (topoPilha == -1);

	}

//	boolean vetorConjuntoIsFull(){
//	return (tamanhoConjunto == vetorConjunto.length);
//	}
//ESTA CHEIO FILA
	private boolean isFull() {
		boolean cheio = false;
		for (int count = 0; count < tamanhoConjunto; count++) {
			if (vetorConjunto[count] != 0) {
				return cheio;
			} else {
				cheio = false;
			}

		}
		return cheio;

	}

	//ESTA CHEIO PILHA
	private boolean isFullPilha() {
		return (topoPilha == vetorConjunto.length - 1);
	}

	//INSERE FILA
	void insert(int info) {
		if (!isFull()) {
			vetorConjunto[tamanhoFila++] = info;
		} else {
			System.out.print("Fila esta cheia");
		}
	}

	//INSERE PILHA
	void push(int info) {
		if (!isFull()) {

			vetorConjunto[--tamanhoConjunto] = info;
		} else {
			System.out.print("Pilha esta cheia");
		}

	}

	//PEEK LISTA
	int peek() {
		return vetorConjunto[0];
	}

	//PEEK PILHA
	int peekPilha() {
		if (isPilhaEmpty() != false) {
			return vetorConjunto[topoPilha];
		}
		return -1;
	}
//RETIRA ELEMENTOS FILA

	int pool() {
		int pollInQueu = 0;
		if (!isFilaEmpty()) {
			int countFila = 1;
			pollInQueu = vetorConjunto[0];
			while (countFila < tamanhoFila - 1) {
				vetorConjunto[countFila - 1] = vetorConjunto[countFila];
				countFila++;
			}
			vetorConjunto[tamanhoFila - 1] = 0;
			tamanhoFila--;
		} else {
			System.out.print("Fila esta vazia");
		}
		return pollInQueu;
	}

	//RETIRA ELEMENTOS PILHA
	int pop() {
		if (!isPilhaEmpty()) {

			return vetorConjunto[topoPilha--];

		}
		return -1;
	}

	//MOSTRA A FILA
	void exibeFila() {
		if (!isFilaEmpty()) {
			for (int count = 0; count < vetorConjunto.length; count++) {
				System.out.print(vetorConjunto[count]+" ");
			}

		} else {
			System.out.print("Fila Vazia");
		}
	}

	//MOSTRA ELEMENNTOS PILHA
	void exibePilha() {
		if (!isPilhaEmpty()) {

			System.out.print("Pilha esta Vazia");

		} else {
			for (int count = 0; count <= topoPilha; count++) {
				System.out.print(vetorConjunto[count]+" ");
			}
		}
	}

}//class
