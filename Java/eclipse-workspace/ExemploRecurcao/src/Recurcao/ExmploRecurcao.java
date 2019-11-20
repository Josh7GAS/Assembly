package Recurcao;

public class ExmploRecurcao {
	public static void contagemRegressivaIterativo(int n) {
		for (int i = n; i >=0; i--) {
			System.out.println(i);
		}
	}

	public static void contagemRegressivaRecursivo(int n) {
		if (n < 0) {
			return;
		}
		else {
			System.out.println(n);
			contagemRegressivaRecursivo(n-1);
		}
	}

	public static int fatorialRecursivo(int n) {
		if (n==0) {
			System.out.println("0! = 1");
			return 1;
		}
		else{
			int fatorial = n * fatorialRecursivo(n-1);
			System.out.println(x);
			return n * fatorialRecursivo(n-1);			
		}
	}
	public static int fatorialInterativo(int n) {
		int resultado = 1;
		for (int i = n; i > 0; i--) {
			resultado*=i;
		}
		return resultado;
	}
	public static void main(String[] args) {
		contagemRegressivaIterativo(5);
		System.out.println();
		contagemRegressivaRecursivo(5);
		System.out.println(fatorialRecursivo(4));
		
		System.out.println(fatorialInterativo(1000));
	}
}
