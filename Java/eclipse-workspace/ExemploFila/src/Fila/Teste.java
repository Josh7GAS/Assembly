package Fila;

public class Teste {
public static void main(String[] args) {
	Fila fila = new Fila(4);
	
	fila.insert("nome");
	fila.insert("sobrenome");
	fila.insert("outronome");
	fila.insert("nomedepois do nome");
	
	fila.show();
}
}
