package Recursividade;

public class Recursividade {
	public static int soma (int number) {
		if (number ==0 ) {
			return 0;
			
		}else {
			return number=number+soma(number-1);
		}
	}
	
	public static int somaVetores()
	public static void main(String[] args) {
		System.out.println(soma(10));
	}
}


