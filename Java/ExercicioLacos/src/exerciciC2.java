
public class exerciciC2 {
	public static void main(String[] args) {
		int i = 0;
		int a = 0;
		int b = 0;

		do {

			a=b+i;
			System.out.println(b+ " + " + i+ " = "+ a);
			b=a;
			i++;

		}while(i<=100);
	}
}
