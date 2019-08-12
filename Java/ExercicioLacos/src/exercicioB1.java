import javax.swing.JOptionPane;
public class exercicioB1 {
	public static void main(String[] args) {
		int var1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Me de um numero"));
		int var2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Me de outro numero"));
		int var3 = 0;

		int i=0;
		while(i<var2) {
			var3 += var1;
			System.out.println(var3);
			i++;
		}
		

	}
}


