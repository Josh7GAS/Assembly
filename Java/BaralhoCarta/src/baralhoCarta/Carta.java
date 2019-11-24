package baralhoCarta;

public class Carta {
	
	private int valor;
	private String face;//face das cartas As, 2, 3 "Valete"
	private String naipe;

	public Carta(String face, String naipe) {
		this.valor = valor;
		this.face = face;
		this.naipe = naipe;
	}

	
	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	
	@Override
	public String toString() {
		return getFace()+" de "+getNaipe();
	}

}//class
