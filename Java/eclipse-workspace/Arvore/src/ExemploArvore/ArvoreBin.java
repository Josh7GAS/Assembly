package ExemploArvore;

public class ArvoreBin {
	//Atributo

	private Node raiz;

	public ArvoreBin(Node raiz) {
		raiz = null;
	}

	//Metodo getRaiz
	public Node getRaiz() {
		return raiz;
	}

	//cria raiz
	public void criaRaiz(int conteudo){
		raiz= new Node(conteudo);
	}

	public Node insereDir(Node pai, int conteudo) {
		if (raiz == null || pai.getDir() !=null) {
			return null;
		}
		Node noNovo = new Node(conteudo);
		pai.setDir(noNovo);
		return(noNovo);
	}

	public Node insereEsq(Node pai, int conteudo) {
		if (raiz == null || pai.getEsq() !=null) {
			return null;
		}
		Node noNovo = new Node(conteudo);
		pai.setEsq(noNovo);
		return(noNovo);
	}

	public void exibeArvore(Node noDaVez) {
		if (noDaVez != null) {
			System.out.print("Conteudo: "+ noDaVez.getConteudo());
			if (noDaVez.getEsq()==null) 
				System.out.print(" - Esq:--");
			}else {
				System.out.print(" - Esq:--" + noDaVez.getEsq().getConteudo());
			}
			if (noDaVez.getDir()==null) {
				System.out.println(" - Dir:--");
			}else {
				System.out.println(" - Dir:--" + noDaVez.getDir().getConteudo());
			}
			
			exibeArvore(noDaVez.getEsq());
			exibeArvore(noDaVez.getDir());
			
		}
	
	public void preOrdem(Node noDaVez) {
		if (noDaVez != null) {
			System.out.println(noDaVez.getConteudo() + "\t");
			preOrdem(noDaVez.getEsq());
			preOrdem(noDaVez.getDir());
		}
	}
	
		public void Ordem(Node noDaVez) {
			if (noDaVez != null) {
				Ordem(noDaVez.getEsq());
				System.out.println(noDaVez.getConteudo() + "\t");
				Ordem(noDaVez.getDir());
			}
		}
			
			public void posOrdem(Node noDaVez) {
				if (noDaVez != null) {
					posOrdem(noDaVez.getEsq());
					posOrdem(noDaVez.getDir());
					System.out.println(noDaVez.getConteudo() + "\t");
				}
		
	}
}
		