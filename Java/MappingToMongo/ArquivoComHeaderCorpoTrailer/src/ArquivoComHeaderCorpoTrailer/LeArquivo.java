package ArquivoComHeaderCorpoTrailer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class LeArquivo {
		
	public static void leArquivo(String nomeArq) {
		BufferedReader entrada = null;
		String registro;
		String tipoRegistro;
		String curso, ra, nomeAluno, nomeDisciplina;
		double media;
		int qtdFalta, contRegistro=0;
		
		// Abre o arquivo
		try {
			entrada = new BufferedReader(new FileReader(nomeArq));
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		
		// L� os registros do arquivo
		try {
			// L� um registro
			registro = entrada.readLine();
			
			while (registro != null) {
				// Obt�m o tipo do registro
				tipoRegistro = registro.substring(0, 2);
				
				if (tipoRegistro.equals("00")) {
					System.out.println("Header");
					System.out.println("Tipo de arquivo: " + registro.substring(2, 6));
					int periodoLetivo= Integer.parseInt(registro.substring(6,11));
					System.out.println("Per�odo letivo: " + periodoLetivo);
					System.out.println("Data/hora de gera��o do arquivo: " + registro.substring(11,30));
					System.out.println("Vers�o do layout: " + registro.substring(30,32));
				}
				else if (tipoRegistro.equals("01")) {
					System.out.println("\nTrailer");
					int qtdRegistro = Integer.parseInt(registro.substring(2,12));
					if (qtdRegistro == contRegistro) {
						System.out.println("Quantidade de registros gravados compat�vel com quantidade lida");
					}	
					else {	
						System.out.println("Quantidade de registros gravados n�o confere com quantidade lida");
					}
				}
				else if (tipoRegistro.contentEquals("02")) {
					if (contRegistro == 0) {
						System.out.println();
						System.out.printf("%-5s %-8s %-50s %-40s %5s %6s\n", "CURSO","RA","NOME DO ALUNO","DISCIPLINA",
								"M�DIA", "FALTAS");

					}
					
					curso = registro.substring(2,7);
					ra = registro.substring(7,15);
					nomeAluno = registro.substring(15,65);
					nomeDisciplina = registro.substring(65,105);
					media = Double.parseDouble(registro.substring(105,110).replace(',','.'));
					qtdFalta = Integer.parseInt(registro.substring(110,113));
					
					System.out.printf("%-5s %-8s %-50s %-40s %5.2f %6d\n", curso, ra, nomeAluno,nomeDisciplina,
							                                               media, qtdFalta);
					contRegistro++;
				}
				else {
					System.out.println("Tipo de registro inv�lido");
				}
				
				// l� o pr�ximo registro
				registro = entrada.readLine();
			}
			
			// Fecha o arquivo
		    entrada.close();
		} catch (IOException e) {
			System.err.printf("Erro ao ler arquivo: %s.\n", e.getMessage());
		}
			
	}

	public static void main(String[] args) {
		String nomeArq = "ArquivoNotas";
		leArquivo(nomeArq);
	}

}
