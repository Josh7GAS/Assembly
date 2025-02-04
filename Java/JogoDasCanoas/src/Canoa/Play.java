package Canoa;

import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class Play {

	  public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int qtdJogadores = readLineAsInt("Quantos jogadores terão essa partida? ");
		int tamanhoRio = 10;
		int tamanhoCanoa = 4;
		String nomeJogador = "";
		String nomeCanoa = "";
		Jogador jogadorTemp = null;
		int posicaoEscolhida = 0;
		int indiceInimigoEscolhido = 0;
		
		Partida partida = new Partida();
	
		for (int indice = 0; indice < qtdJogadores; indice++) {
            nomeJogador = readLineAsString("JOGADOR " + (indice + 1) + "\n\nQual é o seu nome? ");
            nomeCanoa = readLineAsString("JOGADOR " + (indice + 1) + "\n\nQual é nome da sua canoa? ");
            jogadorTemp = new Jogador(nomeJogador, nomeCanoa, tamanhoRio, tamanhoCanoa);
            partida.addJogador(jogadorTemp);
        }	

		do {            
            //MOVENDO CANOAS
            for (int jogadorAtual = 0; jogadorAtual < qtdJogadores; jogadorAtual++) {                
                posicaoEscolhida = readLineAsInt(
                        partida.getJogador(jogadorAtual).getNomeJogador()+ " (J" + (jogadorAtual + 1)
                        + ")\n\nQual nova posição da sua canoa?"
                );

                partida.getRioFromPartida().moveBarco(jogadorAtual, posicaoEscolhida);
            }
            
            //ATIRANDO NO INIMIGO
            for (int jogadorAtual = 0; jogadorAtual < qtdJogadores; jogadorAtual++) {
                posicaoEscolhida = readLineAsInt(
                        partida.getJogador(jogadorAtual).getNomeJogador() + " (J" + (jogadorAtual + 1)
                        + ")\n\nQual posição você quer ATIRAR?"
                );
                
                indiceInimigoEscolhido = readLineAsInt(
                        partida.getJogador(jogadorAtual).getNomeJogador() + " (J" + (jogadorAtual + 1)
                        + ")\n\nQual o índice do inimigo que você quer ATIRAR?"
                );
                
                partida.getRioFromPartida().atiraNaCanoa(indiceInimigoEscolhido);
            }
            
            //Exibindo Resultados do turno atual
            println(partida);
            
        } while (!partida.terminou());
        
        if (partida.empatou()) {
            println("EMPATOU!!!!!");
        }
        else{
            println("PARABÉNS!!! " + partida.alguemGanhou());
        }
        
        System.out.println(partida);        
        
		
	}

	public static void print (Object message) {
		System.out.println(message);
	}
	
	  public static void println(Object message) {
	        System.out.println(message);
	    }
	  
	  public static String readLineAsString(Object message) {
	        print(message);
	        String readValue = "";
	        try {
	            readValue = scanner.nextLine();
	        } catch (Exception e) {
	        }
	        print("");
	        return readValue;
	    }
	  
	  public static int readLineAsInt(Object message){
	        try {
	            return parseInt(readLineAsString(message));
	        } catch (Exception e) {
	            return Integer.MAX_VALUE;
	        }        
	    }
	  
	  public static float readLineAsFloat(Object message){
	        try {
	            return parseFloat(readLineAsString(message));
	        } catch (Exception e) {
	            return Float.MAX_VALUE;
	        }   
	    }
	  
	  public static double readLineAsDouble(Object message){
	        try {
	            return parseDouble(readLineAsString(message));
	        } catch (Exception e) {
	            return Double.MAX_VALUE;
	        }   
	    }
	    
}