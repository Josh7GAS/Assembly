package Canoa;

import java.util.Arrays;

public class Canoa {

	String nomeCanoa;
	boolean [] canoa;
	int tamanhoCanoa;

	public Canoa(String nomeCanoa, int tamanhoCanoa) {
		super();
		this.nomeCanoa = nomeCanoa;
		this.canoa = new boolean[tamanhoCanoa];
	}

	public String getNomeCanoa() {
		return nomeCanoa;
	}

	public boolean[] getCanoa() {
		for (int count = 0; count < canoa.length; count++) {
			canoa[count]=true;
		}
		return canoa;
	}

	public int getTamanhoCanoa() {
		return canoa.length;
	}

	@Override
	public String toString() {
		return "Canoa [nomeCanoa=" + getNomeCanoa() + ", canoa=" + Arrays.toString(getCanoa()) + ", tamanhoCanoa=" + getTamanhoCanoa()
				+ "]";
	}









}

