package node;

public class ListaLigada {
	Node head;

	public ListaLigada() {

		this.head = new Node(0);
	}

	void insertNode(int valor) {
		Node insertedNode = new Node(valor);
		insertedNode.setNext(head);
		head=insertedNode.getNext();

	}

	void exibe() {
		Node atual = head.getNext();
		while(atual!=null) {
			System.out.println(atual.getInfo());
			atual=atual.getNext();
		}	
	}

	Node buscaNode(int valor) {
		Node encontrado = null;
		Node atual = head.getNext();
		while(atual!= null) {
			if (atual.getInfo()==valor) {
				return encontrado=atual;
			}else {
				atual=atual.getNext();
			}
		}
		return encontrado;
	}
	boolean removeNode(int valor) {
		Node ant = head;
		Node atual = head.getNext();
		boolean encontrado=false;
		while(atual!=null) {
			if (atual.getInfo()==valor) {
				ant.setNext(atual.getNext());
				encontrado = true;
			}else {
				ant=atual;
				atual=atual.getNext();
			}	
		}
		return encontrado;
	}

	int tamanho() {
		Node atual = head.getNext();
		int tam =0;
		while(atual !=null) {
			tam +=1;
			atual=atual.getNext();
		}return tam;
	}

}
