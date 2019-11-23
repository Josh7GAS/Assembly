
public class Pilha {
	private int topo;
	private int[] pilha;
	//	private int tamanho;

	public Pilha(int tamanho) {
		this.topo = -1;
		this.pilha = new int [tamanho];
	}

	private boolean isEmpty() {
		return(topo == -1);
	
	}

	private boolean isFull() {
		return (topo == pilha.length-1 );

	}

	void push(int info) {
		if (!isFull()) {

			pilha[++topo]=info;
		}else {
			System.out.println("Pilha esta cheia");
		}


	}

	int pop() {
		if (!isEmpty()) {

			return pilha[topo--];

		}return -1;
	}

	int peek() {
		if (isEmpty()!=false) {
			return pilha[topo];
		} return -1;
	}

	void exibe() {
		if (isEmpty()==true) {

			System.out.println("Pilha esta Vazia");

		}else {
			for (int count = 0; count <= topo; count++) {
				System.out.println(pilha[count]);
			}
		}
	}
}