package baralhoCarta;


// <editor-fold defaultstate="collapsed" desc="imports...">

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author WINDOWS 8.1 JOSHUA, 20/11/2019, 23:14:44
 * Last update: -
 */// </editor-fold>
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
		return getFace()+"de"+getNaipe()+"/n";
	}

}//class
