package baralhoCarta;

public class PilhaObj<T> {

	private int topo;

	private T[] pilha;

	public PilhaObj(int tamanho) {
		this.pilha = (T[]) new Object [tamanho];
	}

	private boolean isEmpty() {
		return (topo == -1);

	}

	public boolean isFull() {
		return (topo == pilha.length-1);

	}

	void push(T info) {
		if (!isFull()) {
			pilha[++topo] = info;
		} else {
			System.out.println("Pilha esta cheia");
		}

	}

	public T pop() {
		if (!isEmpty()) {

			return pilha[topo--];

		}
		return null;
	}

	public T peek() {
		if (isEmpty() != false) {
			return pilha[topo];
		}
		return null;
	}

	void exibe() {
		if (isEmpty() == true) {

			System.out.println("Pilha esta Vazia");

		} else {
			for (int count = 0; count <= topo; count++) {
				System.out.println(pilha[count]);
			}
		}
	}

	@Override
	public String toString() {
		for (int count = 0; count < pilha.length; count++) {
			T mostraPilha = pilha[count];
			System.out.println(mostraPilha);
		};
		return "PilhaObj{" + "topo=" + topo + ", pilha=" + pilha + '}';
	}

	
	
	
}
