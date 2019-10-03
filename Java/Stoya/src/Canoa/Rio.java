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

}
