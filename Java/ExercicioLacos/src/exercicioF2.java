
public class exercicioF2 {
	public static void main(String[] args) {
		int i =0;

		do {
			if(i%4==0) {
				System.out.println("the " + i + " number is divisible by 4 \n");
			}else {

				System.out.println(i + " is NOT divisible by 4 \n");
				
			}i++;
		}while(i<=200);
	}
}
