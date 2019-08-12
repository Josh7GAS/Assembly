
public class exercicoD2 {
	public static void main(String[] args) {
		int i = 0;
		int a = 0;
		int b = 0;

		do {
			if (i%2==0) {
				a=b+i;
				System.out.println(i + " is eveen sum with "+ b + " is equal to " + a + "\n" );
				i++;
				b=a;
			}else {
				System.out.println("number is "+ i+ " is odd. NOT SUMING \n");
				i++;
			}
		}while(i<=100);

	}
}