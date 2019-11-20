
public class Teste {
	
	public boolean ehPalindromo(int vetor[]) {
		Pilha pilhaPalindromo = new Pilha(vetor.length);
		
		for (int count = 0; count < vetor.length; count++) {
			pilhaPalindromo.push(vetor[count]);
		}
		
		for (int countVetor = 0; countVetor < vetor.length; countVetor++) {
			if (vetor[countVetor] != pilhaPalindromo.pop()) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		
	
	}
}
