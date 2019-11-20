package ExemploArvore;

public class Teste {

	public static void main(String[] args) {
		//Cria objeto daclasse ArvoreBin
		ArvoreBin arv = new ArvoreBin(null);

		//Estamo construindo a arvore que esta slide
		//Cria a raiz com valor 6
		arv.criaRaiz(6);
		Node no4=arv.insereEsq(arv.getRaiz(), 4);
		Node no8=arv.insereDir(arv.getRaiz(), 8);
		
		Node no2=arv.insereEsq(arv.getRaiz(), 2);
		Node no5=arv.insereDir(arv.getRaiz(), 5);
		
		Node no1=arv.insereEsq(arv.getRaiz(), 1);
		Node no3=arv.insereDir(arv.getRaiz(), 3);
		
		Node no7=arv.insereEsq(arv.getRaiz(), 7);
		Node no9=arv.insereDir(arv.getRaiz(), 9);
		
		arv.exibeArvore(arv.getRaiz());	
	}

}
