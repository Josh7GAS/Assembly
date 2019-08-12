

public class exercicioC1 {
	public static void main(String[] args) {
		int i=0;
		int a=0;
		int b=0;

		while(i<=100) {
			a=b+i;
			System.out.println("o valor de A: "+ b + " + O valor de B: " + i +" e igual a " + a);
			b=a;	
			i++;
		}		

	}

}

