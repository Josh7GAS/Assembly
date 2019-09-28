package Canoa;

public class Jogador {
	String nickName;
	String nickBoat;
	Canoa canoaSize;
	Rio rioSize;
	
	public Jogador(String nickName, String nickBoat, int canoaSize,int rioSize) {
		super();
		this.nickName = nickName;
		this.nickBoat = nickBoat;
		this.canoaSize = new Canoa(4);
		this.rioSize = new Rio(10);
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNickBoat() {
		return nickBoat;
	}

	public void setNickBoat(String nickBoat) {
		this.nickBoat = nickBoat;
	}

	public Canoa getCanoaSize() {
		return canoaSize;
	}

	public void setCanoaSize(Canoa canoaSize) {
		this.canoaSize = canoaSize;
	}

	public Rio getRioSize() {
		return rioSize;
	}

	public void setRioSize(Rio rioSize) {
		this.rioSize = rioSize;
	}

	
	
		
}