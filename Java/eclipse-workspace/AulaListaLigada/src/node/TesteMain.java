package node;

public class TesteMain {

	public static void main(String[] args) {
		ListaLigada link = new ListaLigada();

		link.insertNode(3);
		link.insertNode(7);
		link.insertNode(9);
		
		link.exibe();
		
		link.buscaNode(7);
		link.exibe();
		
		link.removeNode(9);
		link.exibe();
		
	}

}
