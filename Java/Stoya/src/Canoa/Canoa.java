package Canoa;

public class Canoa {

	String nomeCanoa;
	boolean [] canoa;
	int tamanhoCanoa;

	public Canoa(String nomeCanoa, int tamanhoCanoa) {
		super();
		this.canoa = new boolean[tamanhoCanoa];
	}

	public String getNomeCanoa() {
		return nomeCanoa;
	}

	public void setNomeCanoa(String nomeCanoa) {
		this.nomeCanoa = nomeCanoa;
	}

	public boolean[] getCanoa() {
		return canoa;
	}

	public void setCanoa(boolean[] canoa) {
		this.canoa = canoa;
	}

	public int getTamanhoCanoa() {
		return tamanhoCanoa;
	}









}

