import javax.swing.JOptionPane;

public class exercicioB3 {
public static void main(String[] args) {
	int var1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Me de um numero"));
	int var2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Me de outro numero"));
	int var3 = 0;
	
	for (int i = 0; i < var2; i++) {
		var3+=var2;
		System.out.println(var3);
	}
}
}
