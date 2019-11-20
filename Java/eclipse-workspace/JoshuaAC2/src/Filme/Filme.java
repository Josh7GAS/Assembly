package Filme;

public class Filme {
	int idFilme;
	String nome;
	double nota;
	String genero;
	int idade;
	public Filme(int idFilme, String nome, double nota, String genero, int idade) {
		super();
		this.idFilme = idFilme;
		this.nome = nome;
		this.nota = nota;
		this.genero = genero;
		this.idade = idade;
	}
	public int getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
			return nota;
	}
	public void setNota(double nota) {
//	while(nota<0||nota>10) {
//		
//		System.out.println("Nota Invalida\n"
//				+ "Digite Novamente");
//		
//	}
	this.nota=nota;
		
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade, int limite) {
		while(idade<limite) {
			System.out.println("idade não permitida\n"
					+ "Digite novamente");
		}
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Filme [idFilme=" + idFilme + ", nome=" + nome + ", nota=" + nota + ", genero=" + genero + ", idade="
				+ idade + "]";
	}

	


}
