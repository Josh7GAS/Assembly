package Canoa;

public class Rio {

	boolean [] rio;


	public Rio(int tamanho) {
		super();

		this.rio = new boolean[tamanho];

	}

	public boolean[] getRio() {
		return rio;
	}



	public void setRio(boolean[] rio) {
		this.rio = rio;
	}

	
		public boolean[] moverBarco(int x) {
			Canoa teste = new Canoa(4);
			if (x < teste.getCanoa().length|| x > teste.getCanoa().length) {
	
				System.out.println("Posição Invalida");
	
			}else {
	
				for (int count = x; count < teste.getCanoa().length ; count++) {
					getRio()[count]=true;
				}
	
			}return getRio();
	
		}
		

	//	void receberTiro(int x) {
	//		if (x<tamanho || x>tamanho) {
	//			
	//			System.out.println("Tiro invalido");
	//			
	//		}else{
	//			
	//			for (int count = 0; count < tamanho; count++) {
	//				
	//				if (rio[x]==false) {
	//					
	//					System.out.println("atirou na agua");
	//					
	//				}else{
	//					
	//					System.out.println("Acertou");
	//					rio[x]=false;
	//				}
	//			}
	//
	//		}
	//	}


}

