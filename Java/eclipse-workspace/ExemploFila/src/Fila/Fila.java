package Fila;

public class Fila {
	int tamanho;
	String [] fila;

	public Fila(int capacidade) {

		tamanho = tamanho;
		fila = new String[capacidade];
	}

	boolean isEmpty() {
		return (tamanho == 0);
	}

	boolean isFull() {
		return(tamanho==fila.length);
	}

	void insert(String info) {
		if(!isFull()) {
			fila[tamanho++]=info;	
		}else {
			System.out.println("Fila esta cheia");
		}
	}

	String peek(){
		return fila[0];
	}
	String pool(){
		String pollInQueu = null;
		if (!isEmpty()) {
			int countFila = 1;
			pollInQueu = fila[0];
			while(countFila < tamanho-1)
			{ 
				fila[countFila-1]=fila[countFila];
				countFila++;
			}
			fila[tamanho-1]=null;
			tamanho--;
		}else{
			System.out.println("Fila esta vazia");
		}return pollInQueu;
	}

	void show() {
		if (!isEmpty()) {
			for (int count = 0; count < fila.length; count++) {
				System.out.println(fila[count]);	
			}

		}else {
			System.out.println("Fila Vazia");
		}
	}

}
