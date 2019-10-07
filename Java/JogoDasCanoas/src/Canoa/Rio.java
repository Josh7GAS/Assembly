package Canoa;

import java.util.Arrays;

public class Rio {

	boolean[] rio;
	int tamanhoRio;
	Canoa canoa;

	public Rio(int tamanhoRio, Canoa canoa) {
		super();

		this.rio = new boolean[tamanhoRio];
		this.canoa = canoa;

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


	public boolean moveBarco(int posicaoEscolhida) {
		// 0 - tamahhoRio
		//ou melhor=> tamanhoRio - tamanhoCanoa
		if (posicaoEscolhida >= 0 && posicaoEscolhida < (tamanhoRio - canoa.tamanhoCanoa)) {

			int contCanoa = 0;
			for (int contRio = 0; contRio < tamanhoRio; contRio++) {

				if (contRio >= posicaoEscolhida && contRio < (posicaoEscolhida + canoa.tamanhoCanoa)) {

					rio[contRio] = canoa.getCanoa()[contCanoa];
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
		Boolean estaDestruida=false;

		for (boolean cadaIndex : rio) {
			if (cadaIndex==false) {

				estaDestruida=true;

			}else {

				return estaDestruida;

			}

		}return estaDestruida;

	}

	@Override
	public String toString() {
		return "Rio [rio=" + Arrays.toString(rio) + ", tamanhoRio=" + getTamanhoRio() + "]";
	}


}


