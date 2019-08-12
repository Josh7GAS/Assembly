
public class exercicioD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0;
		int b =0;
		for (int i = 0; i <=500 ; i++) {

			

			if (i%2==0) {
				a=b+i;
				System.out.println(i + " is eveen sum with "+ b + " is equal to " + a + "\n" ); 
				b=a;
				
			}else {
				System.out.println("number is "+ i+ " is odd. NOT SUMING \n");
			}

		}
	}

}