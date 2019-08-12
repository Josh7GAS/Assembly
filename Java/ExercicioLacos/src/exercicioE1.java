
public class exercicioE1 {
	public static void main(String[] args) {
		int i =0;
		int a =0;
		int b =0;

		while(i<=20) {

			if(i%2 != 0) {
				a=b+i;
				System.out.println("Number " + i + " is odd. \n So " + b+ "+" + i + " is equal to "+a);
				b=a;
				i++;
			}else {
				System.out.println("Number " + i + " is eveen. NOT SUMING");
				i++;
			}
		}
	}
}
 