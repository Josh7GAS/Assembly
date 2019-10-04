package Canoa;

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

	public int getTamanhoCanoa() {
		return canoa.tamanhoCanoa;
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


	//AtiraNaCanoa é um metodo de atirar no ambiente do jogo e então o metodo valida o tiro, se foi dentro ou for do barco,
	//em caso de ter sido dentro do barco reduzir o tamanhoCanoa.
	public boolean atiraNaCanoa(int tiro){
		//se o tiro for maior, igual a 0 e menor que o tamanho do Rio é um tiro valido.
		if(tiro>=0 && tiro <(tamanhoRio)){
			//se o tiro for dentro dee um elemento true, significa que está acertando o barco, então eu diminuo o tamanho do rio
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


}


