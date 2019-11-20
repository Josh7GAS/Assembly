package ExemploArvore;

//Atributos
public class Node {
private int conteudo;
private Node esq;
private Node dir;

//constructor
public Node(int conteudo) {
	this.conteudo = conteudo;
	esq=null;
	dir=null;
}
//Setter and Getters
public int getConteudo() {
	return conteudo;
}
public void setCoteudo(int coteudo) {
	this.conteudo = coteudo;
}
public Node getEsq() {
	return esq;
}
public void setEsq(Node esq) {
	this.esq = esq;
}
public Node getDir() {
	return dir;
}
public void setDir(Node dir) {
	this.dir = dir;
}
}
