package Canoa;

import java.util.Arrays;

public class Rio {

	boolean[] rio;
	int tamanhoRio;
	Canoa canoa;

	public Rio(int tamanhoRio, Canoa canoa) {
		super();

		this.canoa = canoa;
		this.rio = new boolean[tamanhoRio];


	}

	public boolean[] getRio() {
		return rio;
	}

	public void setRio(boolean[] rio) {
		this.rio = rio;
	}

	public int getTamanhoRio() {
		return rio.length;
	}

	public Canoa getCanoa() {
		return canoa;
	}

	public boolean moveBarco(int jogadorEscolhido, int posicaoEscolhida) {
		// 0 - tamahhoRio
		//ou melhor=> tamanhoRio - tamanhoCanoa
		while(posicaoEscolhida >= 0 && posicaoEscolhida < (getTamanhoRio() - getCanoa().getTamanhoCanoa() )) {

			int contCanoa = 0;
			for (int contRio = 0; contRio < getTamanhoRio(); contRio++) {

				if (contRio >= posicaoEscolhida && contRio < (posicaoEscolhida + getCanoa().getTamanhoCanoa())) {

					rio[contRio] = getCanoa().getCanoa()[contCanoa];
					contCanoa++;

				}

				else{

					rio[contRio] = false;

				}
			}

			return true;
			
		}
		
		

		return false;
	}



	public boolean atiraNaCanoa(int tiro){
		//se o tiro for maior, igual a 0 e menor que o tamanho do Rio � um tiro valido.
		if(tiro>=0 && tiro <(tamanhoRio)){
			//se o tiro for dentro dee um elemento true, significa que est� acertando o barco, ent�o eu diminuo o tamanho do rio
			if (rio[tiro]==true) {

				canoa.tamanhoCanoa=canoa.getTamanhoCanoa()-1;

			} 

		}else {

			return false;
		}

		return rio[tiro];
	}

	public boolean canoaEstaDestruida() {
		for (boolean pedacoAtivo : rio) {
			if (pedacoAtivo) {
				return false;
			}

		}
		
		return true;
	}
	
	

	@Override
	public String toString() {
		return "Rio [rio=" + Arrays.toString(rio) + ", tamanhoRio=" + getTamanhoRio() + "]";
	}


}


