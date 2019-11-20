package ExemploArvore;

public class ArvoreBinBusca {
//
	private Node raiz;

	public ArvoreBinBusca(Node raiz) {
		super();
		raiz = null;
	}
	
	public void insere(int conteudo) {
		if (raiz == null) {
			raiz = new Node(conteudo);
		}
		else {
			Node noDaVez= raiz;b
			while(noDaVez!=null && noDaVez.getConteudo() != conteudo) {
				Node noNovo = new Node(conteudo);
				if (conteudo <= noDaVez.getConteudo()) {
					if (noDaVez.getEsq() == null) {
						noDaVez.setEsq(noNovo);
					}
					noDaVez = noDaVez.getEsq();				}
			}else {
				if (noDaVez.getDir() == null) {
					noDaVez.setDir(dir);
				}
			}
		}
	}
	
	
}
